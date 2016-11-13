package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "settings")
public class Settings{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    private boolean displayEmail;
    private boolean displayPhone;
    private boolean displayRating;
    
    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public Settings(){
    	
    }
    
    public Settings(Long id){
    	this.id = id;
    	this.displayEmail = true;
    	this.displayPhone = true;
    	this.displayRating = true;
    }
    
    public Long getId(){
    	return id;
    }
    
    public void setId(Long id){
    	this.id = id;
    }
    
    public boolean getDisplayEmail(){
    	return displayEmail;
    }
    
    public void setDisplayEmail(boolean displayEmail){
    	this.displayEmail = displayEmail;
    }
    
    public boolean getDisplayPhone(){
    	return displayPhone;
    }
    
    public void setDisplayPhone(boolean displayPhone){
    	this.displayPhone = displayPhone;
    }
    
    public boolean getDisplayRating(){
    	return displayRating;
    }
    
    public void setDisplayRating(boolean displayRating){
    	this.displayRating = displayRating;
    }
  
    public String toString(){
    	return String.format(
    			"Settings[\n\t" 
    			+ "id=%d,\n\t"
    			+ "displayEmail=%b,\n\t"
    			+ "displayPhone=%b,\n\t"
    			+ "displayRating=%b,\n\t]", 
    			id, displayEmail, displayPhone, displayRating);
    }
}