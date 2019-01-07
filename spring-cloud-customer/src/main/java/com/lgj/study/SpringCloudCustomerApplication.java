package com.lgj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages= {"com.lgj.study"})
@ComponentScan("com.lgj.study")
public class SpringCloudCustomerApplication {
    public static void main(String[] args) {
		SpringApplication.run(SpringCloudCustomerApplication.class, args);
	}
}

