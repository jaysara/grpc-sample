syntax = "proto3";

option java_multiple_files = true;
option java_package = "com.example.grpc";

service EchoService {
  rpc Echo (EchoRequest) returns (EchoResponse);
}

message EchoRequest {
  string message = 1;
  string timestamp = 2;
}

message EchoResponse {
  string message = 1;
  string serverTimestamp = 2;
}

// Spring Boot gRPC Server Implementation
@Service
public class EchoServiceImpl extends EchoServiceGrpc.EchoServiceImplBase {
    @Override
    public void echo(EchoRequest request, StreamObserver<EchoResponse> responseObserver) {
        String serverTimestamp = Instant.now().toString();
        EchoResponse response = EchoResponse.newBuilder()
                .setMessage(request.getMessage())
                .setServerTimestamp(serverTimestamp)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

// Spring Boot gRPC Client Implementation
@Component
public class EchoClient {
    private final EchoServiceGrpc.EchoServiceBlockingStub blockingStub;

    public EchoClient(ManagedChannel channel) {
        this.blockingStub = EchoServiceGrpc.newBlockingStub(channel);
    }

    public void sendMessage(String message) {
        EchoRequest request = EchoRequest.newBuilder()
                .setMessage(message)
                .setTimestamp(Instant.now().toString())
                .build();
        EchoResponse response = blockingStub.echo(request);
        System.out.println("Response from server: " + response.getMessage() + ", Timestamp: " + response.getServerTimestamp());
    }
}

