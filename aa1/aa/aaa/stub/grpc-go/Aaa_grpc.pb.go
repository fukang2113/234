// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package stubs

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// AaaClient is the client API for Aaa service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type AaaClient interface {
	SayHello(ctx context.Context, in *HelloRequest, opts ...grpc.CallOption) (*HelloReply, error)
}

type aaaClient struct {
	cc grpc.ClientConnInterface
}

func NewAaaClient(cc grpc.ClientConnInterface) AaaClient {
	return &aaaClient{cc}
}

func (c *aaaClient) SayHello(ctx context.Context, in *HelloRequest, opts ...grpc.CallOption) (*HelloReply, error) {
	out := new(HelloReply)
	err := c.cc.Invoke(ctx, "/aa.aaa.Aaa/SayHello", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// AaaServer is the server API for Aaa service.
// All implementations must embed UnimplementedAaaServer
// for forward compatibility
type AaaServer interface {
	SayHello(context.Context, *HelloRequest) (*HelloReply, error)
	mustEmbedUnimplementedAaaServer()
}

// UnimplementedAaaServer must be embedded to have forward compatible implementations.
type UnimplementedAaaServer struct {
}

func (UnimplementedAaaServer) SayHello(context.Context, *HelloRequest) (*HelloReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SayHello not implemented")
}
func (UnimplementedAaaServer) mustEmbedUnimplementedAaaServer() {}

// UnsafeAaaServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to AaaServer will
// result in compilation errors.
type UnsafeAaaServer interface {
	mustEmbedUnimplementedAaaServer()
}

func RegisterAaaServer(s grpc.ServiceRegistrar, srv AaaServer) {
	s.RegisterService(&Aaa_ServiceDesc, srv)
}

func _Aaa_SayHello_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(HelloRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AaaServer).SayHello(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/aa.aaa.Aaa/SayHello",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AaaServer).SayHello(ctx, req.(*HelloRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// Aaa_ServiceDesc is the grpc.ServiceDesc for Aaa service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var Aaa_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "aa.aaa.Aaa",
	HandlerType: (*AaaServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "SayHello",
			Handler:    _Aaa_SayHello_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "Aaa.proto",
}
