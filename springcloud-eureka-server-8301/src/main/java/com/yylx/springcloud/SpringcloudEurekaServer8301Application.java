package com.yylx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaServer8301Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServer8301Application.class, args);
    }

}
