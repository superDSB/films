package com.appdemos.films.configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Films_SpringCloudConfigServer {
	public static void main(String[] args) {
		SpringApplication.run(Films_SpringCloudConfigServer.class, args);
	}
}
