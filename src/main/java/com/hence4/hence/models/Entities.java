package com.hence4.hence.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Entities {

	private String id ;
	private String entity;
	private String value;
	
public Entities() {
	
}

public String getEntity() {
	return entity;
}

public void setEntity(String entity) {
	this.entity = entity;
}

public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}

public Entities(String entity, String value) {
	this.entity = entity;
	this.value = value;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

}