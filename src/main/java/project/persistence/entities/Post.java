package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "post") // If you want to specify a table name, you can do so here
public class Post{

	// Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String category;
	private String content;
	
	public Post(){
		
	}
	
	public Post(String category, String content){
		this.category = category;
		this.content = content;
	}
	
	//-------------------------Id----------------------------
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	//-----------------------String---------------------------
	
	public String getCategory(){
		return category;
	}
	
	public void setCategory(String category){
		this.category = category;
	}
	
	//----------------------String-----------------------------
	
	public String getContent(){
		return content;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	//----------------------------------------------------------
	
	public String toString(){
    	return String.format(
    			"\n\t\tPost[category=%s, content=%s]\n\t", 
    			category, content);
    }
	
}