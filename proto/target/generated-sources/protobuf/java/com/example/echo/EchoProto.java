// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: echo.proto

package com.example.echo;

public final class EchoProto {
  private EchoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_echo_EchoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_echo_EchoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_echo_EchoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_echo_EchoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\necho.proto\022\004echo\"\036\n\013EchoRequest\022\017\n\007mes" +
      "sage\030\001 \001(\t\"2\n\014EchoResponse\022\017\n\007message\030\001 " +
      "\001(\t\022\021\n\ttimestamp\030\002 \001(\t2>\n\004Echo\0226\n\013EchoMe" +
      "ssage\022\021.echo.EchoRequest\032\022.echo.EchoResp" +
      "onse\"\000B\037\n\020com.example.echoB\tEchoProtoP\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_echo_EchoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_echo_EchoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_echo_EchoRequest_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_echo_EchoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_echo_EchoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_echo_EchoResponse_descriptor,
        new java.lang.String[] { "Message", "Timestamp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
