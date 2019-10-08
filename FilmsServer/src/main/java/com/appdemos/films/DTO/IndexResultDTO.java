package com.appdemos.films.DTO;

import java.util.List;

import com.appdemos.films.entity.MovieInfo;

public class IndexResultDTO {
	private int category;
	private List<MovieInfo> onShow;
	private List<MovieInfo> onNext;
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public List<MovieInfo> getOnShow() {
		return onShow;
	}
	public void setOnShow(List<MovieInfo> onShow) {
		this.onShow = onShow;
	}
	public List<MovieInfo> getOnNext() {
		return onNext;
	}
	public void setOnNext(List<MovieInfo> onNext) {
		this.onNext = onNext;
	}
	
	
}
