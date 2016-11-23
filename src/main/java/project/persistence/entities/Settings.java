package project.persistence.entities;

import javax.persistence.*;

@Embeddable
public class Settings{
    
    private boolean displayEmail;
    private boolean displayPhone;
    
    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public Settings(){
    	
    }
    
    public Settings(boolean displayEmail, boolean displayPhone){
    	this.displayEmail = true;
    	this.displayPhone = true;
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
    
   
  
    public String toString(){
    	return String.format(
    			"Settings[\n\t" 
    			+ "displayEmail=%b,\n\t"
    			+ "displayPhone=%b,\n\t"
    			+ "]",
    			displayEmail, displayPhone);
    }
}