package com.why.grpcspringcloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GrpcSpringCloudConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GrpcSpringCloudConsumerApplication.class, args);
    }
}
