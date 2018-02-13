package com.springboot.restful.disneytitlesmetadata.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Episode extends Title {

	private String releaseDate;

	private String parentTitle;
	
	private String duration;
	
	private String description;

	
	public Episode(String type, String name, String duration, String releaseDate) {
		super(type, name);
		this.releaseDate = releaseDate;
		this.duration = duration;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}


	@JsonIgnore
	public String getParentTitle() {
		return parentTitle;
	}

	public void setParentTitle(String parentTitle) {
		this.parentTitle = parentTitle;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@JsonIgnore
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
