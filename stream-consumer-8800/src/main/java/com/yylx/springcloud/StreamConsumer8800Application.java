package com.yylx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StreamConsumer8800Application {

    public static void main(String[] args) {
        SpringApplication.run(StreamConsumer8800Application.class, args);
    }

}
