package com.ust.rest;

public class Tag {
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	Integer  id;
	String tagName;
	
	public Tag(Integer id, String tagName) 
	{
		id = this.id;
		tagName = this.tagName;
	}
	
	public Tag()
	{
		
	}
}
