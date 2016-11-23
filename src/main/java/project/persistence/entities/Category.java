package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
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
	
	//--------------------------------------------------------
	
	public String toString(){
    	return String.format(
    			"Category[id=%d"
    			+ ",name=%s]", 
    			id, name);
    }
}