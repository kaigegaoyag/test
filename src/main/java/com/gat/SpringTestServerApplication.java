package com.gat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.gat")
@EnableDiscoveryClient
@SpringBootApplication
public class SpringTestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestServerApplication.class, args);
	}
}
