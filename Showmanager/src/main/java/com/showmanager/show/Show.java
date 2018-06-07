package com.showmanager.show;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity //Tells JPA this is an entity class. JPA will create a table called Show
public class Show implements Comparable{

	//Using and implementing comparable to enable collections.sort in ShowService
	@Override
	public int compareTo(Object compareshow) {
		int compareid=((Show)compareshow).getId();
		return this.id-compareid;
	}
	
	
	public Show() {
		
	}
	
	public Show(int id, String title, String description, String duration, String originalAirDate, String rating,String keywords) {
		super();
		this.id = id;
		this.title = title;
		this.description=description;
		this.duration = duration;
		this.originalAirDate = originalAirDate;
		this.rating = rating;
		this.keywords = keywords;
		
	}
	
	@Id
	private int id; //id is set as primary key
	
	private String title;
	private String description;
	private String duration;
	private String originalAirDate;
	private String rating;
	private String keywords;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getOriginalAirDate() {
		return originalAirDate;
	}
	public void setOriginalAirDate(String originalAirDate) {
		this.originalAirDate = originalAirDate;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	
	
	
	
}
