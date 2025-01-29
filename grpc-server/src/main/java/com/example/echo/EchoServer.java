package com.example.echo;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class EchoServer {
    private final int port;
    private final Server server;

    public EchoServer(int port) {
        this.port = port;
        this.server = ServerBuilder.forPort(port)
                .addService(new EchoServiceImpl())
                .build();
    }

    public void start() throws IOException {
        server.start();
        System.out.println("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            EchoServer.this.stop();
            System.err.println("*** server shut down");
        }));
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        EchoServer server = new EchoServer(50051);
        server.start();
        server.blockUntilShutdown();
    }

    static class EchoServiceImpl extends EchoGrpc.EchoImplBase {
        @Override
        public void echoMessage(EchoRequest req, StreamObserver<EchoResponse> responseObserver) {
            String message = req.getMessage();
            String timestamp = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                    .withZone(ZoneId.systemDefault())
                    .format(Instant.now());

            EchoResponse response = EchoResponse.newBuilder()
                    .setMessage(message)
                    .setTimestamp(timestamp)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
