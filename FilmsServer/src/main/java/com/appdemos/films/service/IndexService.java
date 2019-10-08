package com.appdemos.films.service;

import java.util.List;

import com.appdemos.films.DTO.IndexResultDTO;
import com.appdemos.films.entity.MovieInfo;

public interface IndexService {
	public IndexResultDTO getResult(int category);
	public List<MovieInfo> refreshData(boolean onShow);
}
