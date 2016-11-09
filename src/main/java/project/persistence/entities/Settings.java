package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "Settings")
public class Settings{
	
	// Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Boolean displayEmail;
    private Boolean displayPhone;
    private Boolean displayRating;
    
    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public Settings(){
    	
    }
    
    public Settings(Boolean displayEmail, Boolean displayPhone,
    				Boolean displayRating){
    	this.displayEmail = displayEmail;
    	this.displayPhone = displayPhone;
    	this.displayRating = displayRating;
    }
    
    public Long getId(){
    	return id;
    }
    
    public void setId(Long id){
    	this.id = id;
    }
    
    public Boolean getDisplayEmail(){
    	return displayEmail;
    }
    
    public void setDisplayEmail(Boolean displayEmail){
    	this.displayEmail = displayEmail;
    }
    
    public Boolean getDisplayPhone(){
    	return displayPhone;
    }
    
    public void setDisplayPhone(Boolean displayPhone){
    	this.displayPhone = displayPhone;
    }
    
    public Boolean getDisplayRating(){
    	return displayRating;
    }
    
    public void setDisplayRating(Boolean displayRating){
    	this.displayRating = displayRating;
    }
    
  //I don´t know how to reference objects ;/
   // https://en.wikipedia.org/wiki/Printf_format_string
    // Can %s display boolean??
    @Override
    public String toString(){
    	return String.format(
    			"Settings[displayEmail=%s,"
    			+ "displayPhone=%s,"
    			+ "displayRating=%s]", 
    			displayEmail, displayPhone, displayRating);
    }
}