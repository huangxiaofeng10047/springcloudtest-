package com.yylx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class SpringcloudHystrixDashboard8400Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixDashboard8400Application.class, args);
    }

}
