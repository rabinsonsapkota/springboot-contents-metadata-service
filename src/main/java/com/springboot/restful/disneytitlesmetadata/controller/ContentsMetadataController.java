package com.springboot.restful.disneytitlesmetadata.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restful.disneytitlesmetadata.json.ContentsMetadata;
import com.springboot.restful.disneytitlesmetadata.service.ContentsMetadaService;

@RestController
@RequestMapping("/contentsMetadata")
public class ContentsMetadataController {
	
	public static final Logger logger = LoggerFactory.getLogger(ContentsMetadataController.class);
	
	@Autowired
	private ContentsMetadaService contentsMetadataService;
	
	// Retrieve ALL ContentsMetadata
	@RequestMapping(value = "/getContentsMetadata", produces = MediaType.APPLICATION_JSON_VALUE ,method = RequestMethod.GET)
	public ResponseEntity<List<ContentsMetadata>> getContentsMetadata() {
		List<ContentsMetadata> contentsMetadata = contentsMetadataService.getContentsMetadata();
		if (contentsMetadata.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<ContentsMetadata>>(contentsMetadata, HttpStatus.OK);
	}
	
	// Retrieve ContentsMetadata filtered by Title Type
	@RequestMapping(value= "/getContentsMetadata/{titleType}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseEntity<?> getContentsMetadataByType(@PathVariable(value = "titleType") String titleType) {
		logger.info("Fetching ContentMetadata with titleType {}", titleType);
		
		List<Object> contentsMetadatasByType =  contentsMetadataService.getContentsMetadataByType(titleType);
		if(contentsMetadatasByType == null || contentsMetadatasByType.size()==0) {
			logger.info("Fetching ContentMetadata with titleType {} not found", titleType);
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Object>>(contentsMetadatasByType,HttpStatus.OK);
	}
	
	// Create  ContentsMetadata
	@RequestMapping(value = "/createContentsMetadata", method = {RequestMethod.POST,RequestMethod.GET})
	public ResponseEntity<?> createContentsMetadata() {
		logger.info("Creating ContensMetadata : {}");
		contentsMetadataService.createContentsMetadata();
		return new ResponseEntity<String>(HttpStatus.CREATED);
	} 
	
	// Update  ContentsMetadata
	@RequestMapping(value = "/updateContentsMetadata/{titleType}",method = {RequestMethod.PUT,RequestMethod.GET})
	public ResponseEntity<?> updateContentsMetadata(@PathVariable(value = "titleType") String titleType, @RequestBody ContentsMetadata contentsMetadata) {
		logger.info("Updating ContensMetadata {}", titleType); 
		contentsMetadataService.updateContentsMetadata(titleType,contentsMetadata);
		return new ResponseEntity<String>(HttpStatus.OK);
	} 
	
	// Delete ContentsMetadata
	@RequestMapping(value = "/deleteContentsMetadata/{titleType}", method = { RequestMethod.PUT, RequestMethod.GET })
	public ResponseEntity<?> deleteContentsMetadata(@PathVariable(value = "titleType") String titleType, @RequestBody ContentsMetadata contentsMetadata) {
		logger.info("Deleting ContensMetadata {}", titleType);
		contentsMetadataService.deleteContentsMetadata(titleType, contentsMetadata);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	//Delete all contentsMetadata
	@RequestMapping(value = "/deleteContentsMetadata",method = {RequestMethod.DELETE,RequestMethod.GET})
	public ResponseEntity<ContentsMetadata> deleteContentsMetadata() {
		logger.info("Deleting ContentsMetadata {}"); 
		contentsMetadataService.deleteContentsMetadata();
		return new ResponseEntity<ContentsMetadata>(HttpStatus.OK);
	} 

}
