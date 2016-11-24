package project.persistence.entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="category_id")
	private Long id;
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="account")
    private List<Post> posts;
	
	  //--------------------Object creation-------------------------------
	
	public Category(){
		
	}
	
	public Category(String name){
		this.name = name;
	}
	
	  //--------------------Id-------------------------------
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	//---------------------------Name--------------------------------------
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
//----------------------Posts------------------------------------
    
    public List<Post> getPosts(){
    	return posts;
    }
    
    public void setPosts(List<Post> posts){
    	this.posts = posts;
    }
   
    //--------------------------------------------------------
	//
	
	public String toString(){
    	return String.format(
    			"Category[id=%d"
    			+ ",name=%s]", 
    			id, name);
    }
}