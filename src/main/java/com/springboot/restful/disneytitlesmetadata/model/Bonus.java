package com.springboot.restful.disneytitlesmetadata.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Bonus extends Title{

	private String parentTitle;
	private String duration;
	
	public Bonus(String type, String name, String description,String duration) {
		super(type, name, description);
		this.duration = duration;
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
	
}
