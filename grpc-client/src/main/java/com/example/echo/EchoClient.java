package com.example.echo;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class EchoClient {
    private final ManagedChannel channel;
    private final EchoGrpc.EchoBlockingStub blockingStub;

    public EchoClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        this.blockingStub = EchoGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void echo(String message) {
        EchoRequest request = EchoRequest.newBuilder().setMessage(message).build();
        EchoResponse response;
        try {
            response = blockingStub.echoMessage(request);
            System.out.println("Received: " + response.getMessage() + " at " + response.getTimestamp());
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        EchoClient client = new EchoClient("localhost", 50051);
        try {
            client.echo("Hello, gRPC!");
        } finally {
            client.shutdown();
        }
    }
}
