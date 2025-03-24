package com.student.w10_ribbon_client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RibbonClient(name= "server", configuration=RibbonConfiguration.class)
public class MyClientSideController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/client/frontend")
    public String hi() {
        System.out.println("Making a call to backend...");
        String randomString = restTemplate.getForObject("http://server/backend", String.class);
        return "Server Response :: " + randomString;
    }
}
