package com.why.grpcspringcloudprovider;

import com.why.grpc.cloud.lib.GreeterGrpc;
import com.why.grpc.cloud.lib.GreeterOuterClass;
import io.grpc.stub.StreamObserver;
import lombok.extern.log4j.Log4j2;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

@Log4j2
@GrpcService(GreeterOuterClass.class)
public class GreeterService extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(GreeterOuterClass.HelloRequest request, StreamObserver<GreeterOuterClass.HelloReply> responseObserver) {
        String message = "Hello " + request.getName();
        final GreeterOuterClass.HelloReply.Builder replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage(message);
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
        log.info("Returning " + message);
    }
}
