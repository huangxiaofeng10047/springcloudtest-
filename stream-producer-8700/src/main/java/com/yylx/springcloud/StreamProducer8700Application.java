package com.yylx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StreamProducer8700Application {

    public static void main(String[] args) {
        SpringApplication.run(StreamProducer8700Application.class, args);
    }

}
