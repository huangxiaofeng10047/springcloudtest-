package com.yylx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaServer8300Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServer8300Application.class, args);
    }

}
