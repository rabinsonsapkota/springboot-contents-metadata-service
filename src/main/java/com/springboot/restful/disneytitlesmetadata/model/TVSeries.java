package com.springboot.restful.disneytitlesmetadata.model;

import java.util.List;

public class TVSeries extends Title{

	private String releaseDate;
	private List<Season> seasons;
	
	public TVSeries(String type, String name, String description,String releaseDate,
			List<Season> seasons) {
		super(type, name, description);
		this.releaseDate = releaseDate;
		this.seasons = seasons;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}
	
	
	

}
