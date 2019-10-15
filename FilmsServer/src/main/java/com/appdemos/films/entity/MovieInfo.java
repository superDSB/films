package com.appdemos.films.entity;

import java.util.Date;

public class MovieInfo {
	private long id;
	private String title;
	private String subTitle;
	private String etitle;
	private String types;
	private String tags;
	private String directors;
	private String leadingActors;
	private int duration;
	private String releaseRegion;
	private Date releaseDate;
	private String productionCountry;
	private String coverImageUrl;
	private String description;
	private String score;
	private int scoreNum;
	
	public String getProductionCountry() {
		return productionCountry;
	}
	public void setProductionCountry(String productionCountry) {
		this.productionCountry = productionCountry;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getEtitle() {
		return etitle;
	}
	public void setEtitle(String etitle) {
		this.etitle = etitle;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getDirectors() {
		return directors;
	}
	public void setDirectors(String directors) {
		this.directors = directors;
	}
	public String getLeadingActors() {
		return leadingActors;
	}
	public void setLeadingActors(String leadingActors) {
		this.leadingActors = leadingActors;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getReleaseRegion() {
		return releaseRegion;
	}
	public void setReleaseRegion(String releaseRegion) {
		this.releaseRegion = releaseRegion;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getCoverImageUrl() {
		return coverImageUrl;
	}
	public void setCoverImageUrl(String coverImageUrl) {
		this.coverImageUrl = coverImageUrl;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public int getScoreNum() {
		return scoreNum;
	}
	public void setScoreNum(int scoreNum) {
		this.scoreNum = scoreNum;
	}
	
}
