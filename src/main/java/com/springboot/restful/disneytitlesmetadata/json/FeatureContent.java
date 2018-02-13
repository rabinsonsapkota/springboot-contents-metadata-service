package com.springboot.restful.disneytitlesmetadata.json;

import java.util.List;

import com.springboot.restful.disneytitlesmetadata.model.Bonus;

public class FeatureContent {
	private String type;
	private String name;
	private String description;
	
	private String theatricalReleaseDate;
	private String duration;

	private List<Bonus> bonuses;
	
	public FeatureContent(String type, String name, String description, String theatricalReleaseDate, String duration,
			List<Bonus> bonuses) {
		super();
		this.type = type;
		this.name = name;
		this.description = description;
		this.theatricalReleaseDate = theatricalReleaseDate;
		this.duration = duration;
		this.bonuses = bonuses;
	}


	public List<Bonus> getBonuses() {
		return bonuses;
	}

	public void setBonuses(List<Bonus> bonuses) {
		this.bonuses = bonuses;
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

	public String getTheatricalReleaseDate() {
		return theatricalReleaseDate;
	}

	public void setTheatricalReleaseDate(String theatricalReleaseDate) {
		this.theatricalReleaseDate = theatricalReleaseDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
}