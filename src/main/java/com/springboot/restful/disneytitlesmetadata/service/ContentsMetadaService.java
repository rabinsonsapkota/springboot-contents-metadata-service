package com.springboot.restful.disneytitlesmetadata.service;

import java.util.List;

import com.springboot.restful.disneytitlesmetadata.json.ContentsMetadata;


public interface ContentsMetadaService {
	public void createContentsMetadata();
	public List<ContentsMetadata> getContentsMetadata();
	public List<Object> getContentsMetadataByType(String titleType);
	public void updateContentsMetadata(String titleType,ContentsMetadata contentsMetadata);
	public void deleteContentsMetadata();
	public void deleteContentsMetadata(String titleType, ContentsMetadata contentsMetadata);

}
