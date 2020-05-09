package com.ust.rest;

public class Pet {
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getPhotoUrls() {
		return photoUrls;
	}
	public void setPhotoUrls(String[] photoUrls) {
		this.photoUrls = photoUrls;
	}
	public Tag[] getTags() {
		return tags;
	}
	public void setTags(Tag[] tags) {
		this.tags = tags;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	Integer id;
	Category category;
	String name;
	String[] photoUrls;
	Tag[] tags;
	String status;
	
	public Pet(Integer id,Category category,String name,String[] photos,Tag[] tags,String status)
	{
		this.id= id;
		this.category = category;
		this.name=name;
		this.photoUrls = photos;
		this.tags= tags;
		this.status= status;
	}
	public Pet()
	{
		
	}
}
