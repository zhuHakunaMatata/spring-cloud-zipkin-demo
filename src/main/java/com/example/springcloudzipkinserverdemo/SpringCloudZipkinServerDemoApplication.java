package com.example.springcloudzipkinserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
//@EnableZipkinServer
@EnableZipkinStreamServer
public class SpringCloudZipkinServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZipkinServerDemoApplication.class, args);
	}
}
