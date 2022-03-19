package com.skemaloop.test;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: Aaa.proto")
public final class AaaGrpc {

  private AaaGrpc() {}

  public static final String SERVICE_NAME = "aa.aaa.Aaa";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.skemaloop.test.AaaOuterClass.HelloRequest,
      com.skemaloop.test.AaaOuterClass.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.skemaloop.test.AaaOuterClass.HelloRequest.class,
      responseType = com.skemaloop.test.AaaOuterClass.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skemaloop.test.AaaOuterClass.HelloRequest,
      com.skemaloop.test.AaaOuterClass.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.skemaloop.test.AaaOuterClass.HelloRequest, com.skemaloop.test.AaaOuterClass.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = AaaGrpc.getSayHelloMethod) == null) {
      synchronized (AaaGrpc.class) {
        if ((getSayHelloMethod = AaaGrpc.getSayHelloMethod) == null) {
          AaaGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.skemaloop.test.AaaOuterClass.HelloRequest, com.skemaloop.test.AaaOuterClass.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skemaloop.test.AaaOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skemaloop.test.AaaOuterClass.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new AaaMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AaaStub newStub(io.grpc.Channel channel) {
    return new AaaStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AaaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AaaBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AaaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AaaFutureStub(channel);
  }

  /**
   */
  public static abstract class AaaImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.skemaloop.test.AaaOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.skemaloop.test.AaaOuterClass.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skemaloop.test.AaaOuterClass.HelloRequest,
                com.skemaloop.test.AaaOuterClass.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class AaaStub extends io.grpc.stub.AbstractStub<AaaStub> {
    private AaaStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AaaStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AaaStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AaaStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.skemaloop.test.AaaOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.skemaloop.test.AaaOuterClass.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AaaBlockingStub extends io.grpc.stub.AbstractStub<AaaBlockingStub> {
    private AaaBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AaaBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AaaBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AaaBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.skemaloop.test.AaaOuterClass.HelloReply sayHello(com.skemaloop.test.AaaOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AaaFutureStub extends io.grpc.stub.AbstractStub<AaaFutureStub> {
    private AaaFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AaaFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AaaFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AaaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skemaloop.test.AaaOuterClass.HelloReply> sayHello(
        com.skemaloop.test.AaaOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AaaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AaaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.skemaloop.test.AaaOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.skemaloop.test.AaaOuterClass.HelloReply>) responseObserver);
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

  private static abstract class AaaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AaaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skemaloop.test.AaaOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Aaa");
    }
  }

  private static final class AaaFileDescriptorSupplier
      extends AaaBaseDescriptorSupplier {
    AaaFileDescriptorSupplier() {}
  }

  private static final class AaaMethodDescriptorSupplier
      extends AaaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AaaMethodDescriptorSupplier(String methodName) {
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
      synchronized (AaaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AaaFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
