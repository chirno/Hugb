package project.persistence.entities;

import java.util.Arrays;

public class Comments{
	
    private long id;
    
    private String[] buyer;
    private String[] user;
    
    public Comments(){
    	
    }
    
    public Comments(long id){
    	this.id = id;
    	this.buyer = new String[]{"test","testing"};
    	this.user = new String[]{"test2"};
    }
    
    public long getId(){
    	return id;
    }
    
    public void setId(long id){
    	this.id = id;
    }
    
    public String[] getBuyer(){
    	return buyer;
    }
    
    public void setBuyer(String[] buyer){
    	this.buyer = buyer;
    }
    
    public String[] getUser(){
    	return user;
    }
    
    public void setUser(String[] user){
    	this.user = user;
    }
    
    public String toString(){
    	return String.format(
    			"Comments[\n\t"
    			+ "id=%d,\n\t"
    			+ "buyer=%s,\n\t"
    			+ "user=%s,\n\t"
    			+ "]", 
    			id, Arrays.deepToString(buyer), Arrays.deepToString(user));
    }
}