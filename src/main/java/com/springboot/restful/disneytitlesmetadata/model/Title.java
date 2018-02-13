package com.springboot.restful.disneytitlesmetadata.model;

public abstract class Title {

	public  String type;
	public  String name;
	public  String description;

	public Title(String type, String name, String description) {
		super();
		this.type = type;
		this.name = name;
		this.description = description;
	}

	public Title(String type, String name) {
		super();
		this.type = type;
		this.name = name;
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
	
}
