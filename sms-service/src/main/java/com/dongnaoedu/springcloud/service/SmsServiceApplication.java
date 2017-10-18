package com.dongnaoedu.springcloud.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.dongnaoedu")
@EnableEurekaClient
public class SmsServiceApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(SmsServiceApplication.class).web(true).run(args);
	}
}
