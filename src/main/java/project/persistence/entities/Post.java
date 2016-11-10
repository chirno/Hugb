package project.persistence.entities;

import project.Application;

public class Post{

	static long id_counter;
	private long id;
	
	private Category category;
	private Content content;
	
	public Post(){
		
	}
	
	public Post(Category category, Content content){
		this.id = id_counter;
		id_counter++;
		this.category = category;
		this.content = content;
	}
	
	//-------------------------Id----------------------------
	
	public long getId(){
		return id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	//-----------------------Category---------------------------
	
	public Category getCategory(){
		return category;
	}
	
	public void setCategory(Category category){
		this.category = category;
	}
	
	//----------------------Content-----------------------------
	
	public Object getContent(){
		return content;
	}
	
	public void setContent(Content content){
		this.content = content;
	}
	
	//----------------------------------------------------------
	
	public String toString(){
    	return String.format(
    			"\n\t\tPost[category=%s, content=%s]\n\t", 
    			category, content);
    }
	
}