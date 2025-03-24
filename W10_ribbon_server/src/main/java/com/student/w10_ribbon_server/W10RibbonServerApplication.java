package com.student.w10_ribbon_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class W10RibbonServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(W10RibbonServerApplication.class, args);
    }

}
