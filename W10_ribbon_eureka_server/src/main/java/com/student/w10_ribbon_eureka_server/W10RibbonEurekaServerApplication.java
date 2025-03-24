package com.student.w10_ribbon_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class W10RibbonEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(W10RibbonEurekaServerApplication.class, args);
    }

}


