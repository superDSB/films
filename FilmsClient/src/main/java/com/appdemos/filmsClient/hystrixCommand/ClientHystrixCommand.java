package com.appdemos.filmsClient.hystrixCommand;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.appdemos.filmsClient.DTO.IndexResultDTO;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class ClientHystrixCommand extends HystrixCommand<IndexResultDTO> {
	private RestTemplate restTemplate;
	private String url;
	private Object param;
	public ClientHystrixCommand(String group,RestTemplate restTemplate,String url,Object param) {
		super(HystrixCommandGroupKey.Factory.asKey(group),100);
		this.restTemplate = restTemplate;
		this.url = url;
	}

	@Override
	protected IndexResultDTO run() throws Exception {
		return restTemplate.getForObject(url, IndexResultDTO.class);
	}
	@Override
	protected IndexResultDTO getFallback() {
		// TODO Auto-generated method stub
		System.out.println("出错");
		return null;
	}
}
