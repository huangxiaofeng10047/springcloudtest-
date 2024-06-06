package com.yylx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class SpringcloudConfigServer8600Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigServer8600Application.class, args);
    }

}
