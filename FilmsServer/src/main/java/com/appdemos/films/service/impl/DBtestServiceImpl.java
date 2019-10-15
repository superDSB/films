package com.appdemos.films.service.impl;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import com.appdemos.films.entity.CelebrityInfo;
import com.appdemos.films.entity.MovieInfo;
import com.appdemos.films.mappers.CelebrityinfoMapper;
import com.appdemos.films.mappers.MovieInfoMapper;
import com.appdemos.films.service.DBtestService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
@Service
public class DBtestServiceImpl implements DBtestService {
	@Autowired
	private CelebrityinfoMapper celebrityInfoMapper;
	@Autowired
	private MovieInfoMapper movieInfoMapper;
	@Override
	public int getTotalCount() {
		CelebrityInfo info = new CelebrityInfo();
		info.setCname("雷逗比");
		return celebrityInfoMapper.getTotal(info);
		//return celebrityInfoMapper.selectCount(new EntityWrapper<CelebrityInfo>());
	}

	@Override
	public boolean addOne() {
		/*CelebrityInfo info = new CelebrityInfo();
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
		int result = celebrityInfoMapper.insert(info);*/
		
		MovieInfo info = new MovieInfo();
		info.setId(1);
		info.setTitle("中国机长");
		info.setSubTitle("川航8633");
		info.setEtitle("captonofchina");
		info.setTypes("空难");
		info.setTags("主旋律");
		info.setDirectors("林");
		info.setLeadingActors("张涵予，袁泉，李沁");
		info.setDuration(119);
		info.setReleaseRegion("chengdu");
		info.setReleaseDate(new Date());
		info.setCoverImageUrl("null");
		info.setDescription("川航8633");
		info.setScore("7.9");
		info.setScoreNum(800);
		movieInfoMapper.insert(info);
		info.setId(2);
		info.setTitle("我和我的祖国");
		info.setSubTitle("祖国");
		info.setEtitle("china");
		info.setTypes("主旋律");
		info.setTags("主旋律");
		info.setDirectors("5个");
		info.setLeadingActors("黄渤，葛优");
		info.setDuration(119);
		info.setReleaseRegion("chengdu");
		info.setReleaseDate(new Date());
		info.setCoverImageUrl("null");
		info.setDescription("70周年纪念");
		info.setScore("7.9");
		info.setScoreNum(800);
		int result = movieInfoMapper.insert(info);
		return result==0?false:true;
	}

}
