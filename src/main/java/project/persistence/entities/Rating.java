package project.persistence.entities;

public class Rating{
	
    private Long id;
    
    private Object comments;
    private Double rating;
    
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
    
  
    public String toString(){
    	return String.format(
    			"Rating[rating=%f]", 
    			rating);
    }
}