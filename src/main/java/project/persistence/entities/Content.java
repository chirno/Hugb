package project.persistence.entities;

import javax.persistence.*;

public class Content{
	
	private String name;
	private String content;
	
	
	public Content(){
		
	}
	
	public Content(String name, String content){
		this.name = name;
		this.content = content;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getContent(){
		return content;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	
}