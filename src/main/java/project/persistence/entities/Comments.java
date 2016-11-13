package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comments{
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String buyerComments;
    private String userComments;
    
    public Comments(){
    	
    }
    
    public Comments(Long id, String buyerComments, String userComments){
    	this.id = id;
    	this.buyerComments = buyerComments;
        this.userComments = userComments;
    }
    
    public Long getId(){
    	return id;
    }
    
    public void setId(Long id){
    	this.id = id;
    }
    
    public String getBuyerComments(){
    	return buyerComments;
    }
    
    public void setBuyerComments(String buyerComments){
    	this.buyerComments = buyerComments;
    }
    
    public String getUserComments(){
    	return userComments;
    }
    
    public void setUserComments(String userComments){
    	this.userComments = userComments;
    }
    
    public String toString(){
    	return String.format(
    			"Comments[\n\t"
    			+ "id=%d,\n\t"
    			+ "buyerComments=%s,\n\t"
    			+ "user=%s,\n\t"
    			+ "]", 
    			id, buyerComments, userComments);
    }
}