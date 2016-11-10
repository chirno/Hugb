package project.persistence.entities;

public class Post{
	

	private long id;
	
	private Category category;
	private Content content;
	
	public Post(){
		
	}
	
	public Post(long id, Category category, Content content){
		//this.id = ;
		//this.category = category;
		//this.content = content;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public Object getCategory(){
		return category;
	}
	
	public void setCategory(Category category){
		this.category = category;
	}
	
	public Object getContent(){
		return content;
	}
	
	public void setContent(Content content){
		this.content = content;
	}
	
	
}