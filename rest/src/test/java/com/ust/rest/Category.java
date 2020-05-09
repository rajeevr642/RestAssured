package com.ust.rest;

public class Category {
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	Integer id;
	String catName;
	
	public Category(Integer id, String catName)
	{
		this.id =  id;
		this.catName = catName;
	}
	
	public Category()
	{
		
	}
}
