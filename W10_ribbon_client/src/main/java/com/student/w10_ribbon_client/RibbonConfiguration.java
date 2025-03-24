package com.student.w10_ribbon_client;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.client.config.DefaultClientConfigImpl;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;

@Configuration
public class RibbonConfiguration {

    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    IPing ribbonPing(IClientConfig config) {
        return new PingUrl();
    }

    @Bean
    IClientConfig ribbonClientConfig() {
        return new DefaultClientConfigImpl();
    }

    @Bean
    IRule ribbonRule(IClientConfig config) {
        return new AvailabilityFilteringRule();
    }
}
