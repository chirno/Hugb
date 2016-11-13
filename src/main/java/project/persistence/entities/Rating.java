package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "rating")
public class Rating{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    private String comments;
    private double rating;
    
    public Rating(){
    	
    }
    
    public Rating(Long id, String comments, double rating){
    	this.id = id;
    	this.comments = comments;
    	this.rating = rating;
    }
    
    public Long getId(){
    	return id;
    }
    
    public void setId(Long id){
    	this.id = id;
    }
    
    public String getComments(){
    	return comments;
    }
    
    public void setComments(String comments){
    	this.comments = comments;
    }
    
    public double getRating(){
    	return rating;
    }
    
    public void setRating(double rating){
    	this.rating = rating;
    }
    
  
    public String toString(){
    	return String.format(
    			"Rating[\n\t"
    			+ "id=%d,\n\t"
    			+ "rating=%s,\n\t"
    			+ "comments=%s,\n\t"
    			+ "]", 
    			id, rating, comments);
    }
}