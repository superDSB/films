package com.appdemos.films.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appdemos.films.DTO.IndexResultDTO;
import com.appdemos.films.entity.MovieInfo;
import com.appdemos.films.mappers.MovieInfoMapper;
import com.appdemos.films.service.IndexService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
@Service
public class IndexServiceImpl implements IndexService{
	@Autowired
	private MovieInfoMapper movieInfoMapper;
	@Override
	public List<MovieInfo> refreshData(boolean onshow) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		List<MovieInfo> list = null;
		EntityWrapper<MovieInfo> wrapper = new EntityWrapper<MovieInfo>();
		if(onshow){
			wrapper.le("RELEASE_DATE", format.format(new Date()));
			list = movieInfoMapper.selectList(wrapper);
		}else{
			wrapper.gt("RELEASE_DATE", format.format(new Date()));
			list = movieInfoMapper.selectList(wrapper);
		}
		return list;
	}
	@Override
	public IndexResultDTO getResult(int category) {
		IndexResultDTO result = new IndexResultDTO();
		result.setCategory(category);
		result.setOnShow(refreshData(true));
		result.setOnNext(refreshData(false));
		return result;
	}

}
