package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "Rating")
public class Rating{
	
	// Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Object comments;
    private Double rating;
    
    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public Rating(){
    	
    }
    
    public Rating(	Object comments, Double rating){
    	this.comments = comments;
    	this.rating = rating;
    }
    
    public Long getId(){
    	return id;
    }
    
    public void setId(Long id){
    	this.id = id;
    }
    
    public Object getComments(){
    	return comments;
    }
    
    public void setComments(Object comments){
    	this.comments = comments;
    }
    
    public Double getRating(){
    	return rating;
    }
    
    public void setRating(Double rating){
    	this.rating = rating;
    }
    
  //I don´t know how to reference objects ;/
   // https://en.wikipedia.org/wiki/Printf_format_string
    @Override
    public String toString(){
    	return String.format(
    			"Rating[rating=%f]", 
    			rating);
    }
}