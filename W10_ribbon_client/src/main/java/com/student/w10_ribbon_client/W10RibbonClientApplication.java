package com.student.w10_ribbon_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class W10RibbonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(W10RibbonClientApplication.class, args);
    }

}
