package com.appdemos.films.service.impl;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import com.appdemos.films.entity.CelebrityInfo;
import com.appdemos.films.entity.Test;
import com.appdemos.films.mappers.CelebrityinfoMapper;
import com.appdemos.films.service.DBtestService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
@Service
public class DBtestServiceImpl implements DBtestService {
	@Autowired
	private Test test;
	@Autowired
	private CelebrityinfoMapper celebrityInfoMapper;
	@Override
	public int getTotalCount() {
		System.out.println(test.getName());
		return celebrityInfoMapper.selectCount(new EntityWrapper<CelebrityInfo>());
	}

	@Override
	public boolean addOne() {
		CelebrityInfo info = new CelebrityInfo();
		info.setId(1);
		info.setCname("雷逗比");
		info.setAlias("帅得扣脚");
		info.setEname("SuperDSB");
		info.setTags("日本动作类");
		info.setBirthday(new Date());
		info.setBirthPlace("四川");
		info.setHeight(180);
		info.setNationality("中国");
		info.setMinzu("汉");
		info.setGender(1+"");
		info.setGraduatedSchool("成都学院");
		info.setDescription("帅得被人砍");
		int result = celebrityInfoMapper.insert(info);
		return result==0?false:true;
	}

}
