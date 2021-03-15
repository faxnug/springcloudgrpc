package com.why.grpcspringcloudconsumer;

import com.why.grpc.cloud.lib.GreeterGrpc;
import com.why.grpc.cloud.lib.GreeterOuterClass;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;
import io.grpc.Channel;

@Service
public class GrpcClientService {
    @GrpcClient("grpc-spring-cloud-provider")
    private Channel serverChannel;

    public String sendMessage(String name){
        GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(serverChannel);
        GreeterOuterClass.HelloReply response = stub.sayHello(GreeterOuterClass.HelloRequest.newBuilder().setName(name).build());
        return response.getMessage();
    }
}
