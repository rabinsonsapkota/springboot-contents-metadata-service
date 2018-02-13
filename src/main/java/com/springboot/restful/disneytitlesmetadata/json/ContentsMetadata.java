package com.springboot.restful.disneytitlesmetadata.json;

import java.util.List;

public class ContentsMetadata {
	private List<FeatureContent> featureContents;
	private List<TVContent> tvContents;
	public ContentsMetadata(List<FeatureContent> featureContents, List<TVContent> tvContents) {
		super();
		this.featureContents = featureContents;
		this.tvContents = tvContents;
	}
	
	public ContentsMetadata(List<FeatureContent> featureContents) {
		super();
		this.featureContents = featureContents;
	}

	public List<FeatureContent> getFeatureContents() {
		return featureContents;
	}
	public void setFeatureContents(List<FeatureContent> featureContents) {
		this.featureContents = featureContents;
	}
	public List<TVContent> getTvContents() {
		return tvContents;
	}
	public void setTvContents(List<TVContent> tvContents) {
		this.tvContents = tvContents;
	}
	
}