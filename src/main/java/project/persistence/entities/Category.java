package project.persistence.entities;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category{
	
	
	private Long id;
	
	private String name;
	private Set<Post> posts;
	
	public Category(){
		
	}
	
	public Category(Long id, String name){
		this.id = id;
		this.name = name;
	}
	
	//-----------------------------------------------------------------
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "CategoryId", unique = true, nullable = false)
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	//-----------------------------------------------------------------
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	//-----------------------------------------------------------------
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	public Set<Post> getPosts(){
		return posts;
	}
	
	public void setPosts(Set<Post> posts){
		this.posts = posts;
	}
	
	//--------------------------------------------------------
	
	public String toString(){
    	return String.format(
    			"Category[id=%d,name=%s]", 
    			id, name);
    }
}