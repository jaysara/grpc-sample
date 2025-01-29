package com.example.echo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The Echo service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: echo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EchoGrpc {

  private EchoGrpc() {}

  public static final String SERVICE_NAME = "echo.Echo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.echo.EchoRequest,
      com.example.echo.EchoResponse> getEchoMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EchoMessage",
      requestType = com.example.echo.EchoRequest.class,
      responseType = com.example.echo.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.echo.EchoRequest,
      com.example.echo.EchoResponse> getEchoMessageMethod() {
    io.grpc.MethodDescriptor<com.example.echo.EchoRequest, com.example.echo.EchoResponse> getEchoMessageMethod;
    if ((getEchoMessageMethod = EchoGrpc.getEchoMessageMethod) == null) {
      synchronized (EchoGrpc.class) {
        if ((getEchoMessageMethod = EchoGrpc.getEchoMessageMethod) == null) {
          EchoGrpc.getEchoMessageMethod = getEchoMessageMethod =
              io.grpc.MethodDescriptor.<com.example.echo.EchoRequest, com.example.echo.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EchoMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.echo.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.echo.EchoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoMethodDescriptorSupplier("EchoMessage"))
              .build();
        }
      }
    }
    return getEchoMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EchoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoStub>() {
        @java.lang.Override
        public EchoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoStub(channel, callOptions);
        }
      };
    return EchoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EchoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoBlockingStub>() {
        @java.lang.Override
        public EchoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoBlockingStub(channel, callOptions);
        }
      };
    return EchoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EchoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoFutureStub>() {
        @java.lang.Override
        public EchoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoFutureStub(channel, callOptions);
        }
      };
    return EchoFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The Echo service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sends a message and receives a response with a timestamp.
     * </pre>
     */
    default void echoMessage(com.example.echo.EchoRequest request,
        io.grpc.stub.StreamObserver<com.example.echo.EchoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoMessageMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Echo.
   * <pre>
   * The Echo service definition.
   * </pre>
   */
  public static abstract class EchoImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EchoGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Echo.
   * <pre>
   * The Echo service definition.
   * </pre>
   */
  public static final class EchoStub
      extends io.grpc.stub.AbstractAsyncStub<EchoStub> {
    private EchoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a message and receives a response with a timestamp.
     * </pre>
     */
    public void echoMessage(com.example.echo.EchoRequest request,
        io.grpc.stub.StreamObserver<com.example.echo.EchoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Echo.
   * <pre>
   * The Echo service definition.
   * </pre>
   */
  public static final class EchoBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EchoBlockingStub> {
    private EchoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a message and receives a response with a timestamp.
     * </pre>
     */
    public com.example.echo.EchoResponse echoMessage(com.example.echo.EchoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Echo.
   * <pre>
   * The Echo service definition.
   * </pre>
   */
  public static final class EchoFutureStub
      extends io.grpc.stub.AbstractFutureStub<EchoFutureStub> {
    private EchoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a message and receives a response with a timestamp.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.echo.EchoResponse> echoMessage(
        com.example.echo.EchoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ECHO_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ECHO_MESSAGE:
          serviceImpl.echoMessage((com.example.echo.EchoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.echo.EchoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getEchoMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.echo.EchoRequest,
              com.example.echo.EchoResponse>(
                service, METHODID_ECHO_MESSAGE)))
        .build();
  }

  private static abstract class EchoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EchoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.echo.EchoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Echo");
    }
  }

  private static final class EchoFileDescriptorSupplier
      extends EchoBaseDescriptorSupplier {
    EchoFileDescriptorSupplier() {}
  }

  private static final class EchoMethodDescriptorSupplier
      extends EchoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EchoMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EchoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EchoFileDescriptorSupplier())
              .addMethod(getEchoMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
