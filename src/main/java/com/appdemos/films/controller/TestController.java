package com.appdemos.films.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdemos.films.service.DBtestService;

@RestController
public class TestController {
	@Autowired
	private DBtestService dbtestService;
	@PostMapping("/addOne")
	public String addOne(){
		return dbtestService.addOne()?"true":"false";
	}
	@GetMapping("/getCount")
	public int getCount(){
		return dbtestService.getTotalCount();
	}
}
