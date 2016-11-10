package project.persistence.entities;

public class Rating{
	
    private long id;
    
    private Comments comments;
    private double rating;
    
    public Rating(){
    	
    }
    
    public Rating(long id){
    	this.id = id;
    	this.comments = new Comments(this.id);
    	this.rating = 0.0;
    }
    
    public long getId(){
    	return id;
    }
    
    public void setId(long id){
    	this.id = id;
    }
    
    public Comments getComments(){
    	return comments;
    }
    
    public void setComments(Comments comments){
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