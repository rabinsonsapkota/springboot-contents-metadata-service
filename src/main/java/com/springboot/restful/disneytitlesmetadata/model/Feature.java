package com.springboot.restful.disneytitlesmetadata.model;

import java.util.List;

public class Feature extends Title{
	
	private String theatricalReleaseDate;
	private String duration;
	
	public  List<Bonus> bonuses;
	
	public Feature(String type, String name, String description, List<Bonus> bonuses, String theatricalReleaseDate,
			String duration) {
		super(type, name, description);
		this.theatricalReleaseDate = theatricalReleaseDate;
		this.duration = duration;
		this.bonuses = bonuses; 
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

	public List<Bonus> getBonuses() {
		return bonuses;
	}

	public void setBonuses(List<Bonus> bonuses) {
		this.bonuses = bonuses;
	}
	
	
}
