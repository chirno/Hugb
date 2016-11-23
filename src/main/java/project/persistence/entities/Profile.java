package project.persistence.entities;

import javax.persistence.*;

@Embeddable
public class Profile{
	
    private String email;
    private String name;
    private String phone;
    //private double rating;
    
    @Embedded
    private Settings settings;
    
    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public Profile(){
    	
    }
    
    public Profile(String email, String name, 
    				String phone){
    	this.email=email;
    	this.name=name;
    	this.phone=phone;
    }
    
    //--------------------Email-------------------------------
    
    public String getEmail(){
    	return email;
    }
    
    public void setEmail(String email){
    	this.email = email;
    }
    
  //---------------------Name---------------------------------
    
    public String getName(){
    	return name;
    }
    
    public void setName(String name){
    	this.name = name;
    }
    
    //----------------------Phone------------------------------------
    
    public String getPhone(){
    	return phone;
    }
    
    public void setPhone(String phone){
    	this.phone = phone;
    }
    
    //----------------------Rating-----------------------------------
   /* 
    public double getRating(){
    	return rating;
    }
    
    public void setRating(double rating){
    	this.rating = rating;
    }
    */
    //----------------------Setting-----------------------------------
    
    public Settings getSettings(){
    	return settings;
    }
    
    public void setSettings(Settings settings){
    	this.settings = settings;
    }
    
    //----------------------Other-----------------------------------
      
    public String toString(){
    	return String.format(
    			"Profile[\n\t"
    			+ "email=%s,\n\t"
    			+ "name=%s,\n\t"
    			+ "phone=%s,\n\t"
    			+ "settings=%s,\n\t"
    			+ "]",
    			email, name, phone, settings);
    }
}