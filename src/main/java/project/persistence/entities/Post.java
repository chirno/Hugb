package project.persistence.entities;

public class Post{
	

	private Long id;
	
	private Object category;
	private Object content;
	private Object account;
	
	public Post(){
		
	}
	
	public Post(Object category, Object content, Object account){
		this.category = category;
		this.content = content;
		this.account = account;
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
	
	public void setCategory(Object category){
		this.category = category;
	}
	
	public Object getContent(){
		return content;
	}
	
	public void setContent(Object content){
		this.content = content;
	}
	
	public Object getAccount(){
		return account;
	}
	
	public void setAccount(Object account){
		this.account = account;
	}
}