package com.springboot.restful.disneytitlesmetadata.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Season extends Title {

	private List<Episode> episodes;
	private String parentTitle;
	private String description;
	public Season(String type, String name, List<Episode> episodes) {
		super(type, name);
		this.episodes = episodes;
	}

	public List<Episode> getEpisodes() {
		return episodes;
	}
	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}

	@JsonIgnore
	public String getParentTitle() {
		return parentTitle;
	}
	public void setParentTitle(String parentTitle) {
		this.parentTitle = parentTitle;
	}

	@JsonIgnore
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
