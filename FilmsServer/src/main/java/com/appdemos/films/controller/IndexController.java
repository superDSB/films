package com.appdemos.films.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appdemos.films.DTO.IndexResultDTO;
import com.appdemos.films.service.IndexService;

@RestController
public class IndexController {
	@Autowired
	private IndexService indexService;
	@GetMapping("/")
	public IndexResultDTO index(){
		IndexResultDTO result = indexService.getResult(0);
		return result;
	}
	
	
	@GetMapping("/findByName")
	public IndexResultDTO findByName(@RequestParam String title){
		IndexResultDTO result = indexService.getResult(title);
		return result;
	}
}
