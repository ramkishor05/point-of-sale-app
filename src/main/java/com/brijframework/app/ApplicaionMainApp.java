package com.brijframework.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient 
public class ApplicaionMainApp {
    public static void main(String[] args) {
    	
        SpringApplication.run(ApplicaionMainApp.class, args);
    }
}