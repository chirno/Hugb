package project.persistence.entities;


public class Content{
	
	private String categoryName;
	private String postContent;
	
	
	public Content(){
		
	}
	
	public Content(String categoryName, String postContent){
		this.categoryName = categoryName;
		this.postContent = postContent;
	}
	
	public String getCategoryName(){
		return categoryName;
	}
	
	public void setCategoryName(String categoryName){
		this.categoryName = categoryName;
	}
	
	public String getPostContent(){
		return postContent;
	}
	
	public void setPostContent(String postContent){
		this.postContent = postContent;
	}
	
	
}