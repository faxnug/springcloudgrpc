package com.why.grpcspringcloudprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GrpcSpringCloudProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(GrpcSpringCloudProviderApplication.class, args);
    }
}
