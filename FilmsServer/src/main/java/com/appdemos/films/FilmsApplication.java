package com.appdemos.films;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.appdemos.films.entity.Test;

@SpringBootApplication
@MapperScan(basePackages = {"com.appdemos.films.mappers"})
@EnableDiscoveryClient
public class FilmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmsApplication.class, args);
	}
}
