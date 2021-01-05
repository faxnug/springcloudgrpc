package com.why.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author why
 * @version 1.0
 * @date 2021/1/5 23:02
 */
@SpringBootApplication
@EnableEurekaServer
public class GrpcEurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(GrpcEurekaServerApplication.class, args);
	}
}
