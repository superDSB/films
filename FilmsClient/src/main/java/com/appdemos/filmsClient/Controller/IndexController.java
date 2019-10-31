package com.appdemos.filmsClient.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.appdemos.filmsClient.DTO.IndexResultDTO;
import com.appdemos.filmsClient.hystrixCommand.ClientHystrixCommand;

@RestController
public class IndexController {
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${spring.application.name}")
	private String serviceName;
	@GetMapping("/")
	public IndexResultDTO getAllInfo(){
		ClientHystrixCommand command = new ClientHystrixCommand(serviceName, restTemplate, "http://FILMSSERVER/films/",null);
		return command.execute();
	}
	@GetMapping("/findByName")
	public IndexResultDTO getInfoByname(@RequestParam String title){
		System.out.println(title);
		ClientHystrixCommand command = new ClientHystrixCommand(serviceName, restTemplate, "http://FILMSSERVER/films/findByName?title="+ title,null);
		return command.execute();
	}
}