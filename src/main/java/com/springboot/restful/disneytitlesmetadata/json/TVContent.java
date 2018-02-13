package com.springboot.restful.disneytitlesmetadata.json;

import java.util.List;

import com.springboot.restful.disneytitlesmetadata.model.Season;

public class TVContent {
	private String type;
	private String name;
	private String description;	
	private String releaseDate;
	private List<Season> seasons;

	public TVContent(String type, String name, String releaseDate, String description, List<Season> seasons) {
		super();
		this.type = type;
		this.name = name;
		this.releaseDate = releaseDate;
		this.description = description;
		this.seasons = seasons;
	}

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	
}