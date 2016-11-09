package project.persistence.entities;

import javax.persistence.*;

/**
 * The class for the Postit Note itself.
 * The system generates a table schema based on this class for this entity.
 * Be sure to annotate any entities you have with the @Entity annotation.
 */
@Entity
@Table(name = "Profile")
public class Profile{
	
	 // Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String email;
    private String name;
    private String phone;
    private Object rating;
    private Object settings;
    
    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public Profile(){
    	
    }
    
    public Profile(	String email, String name, 
    				String phone, Object rating, 
    				Object settings){
    	this.email=email;
    	this.name=name;
    	this.phone=phone;
    	this.rating=rating;
    	this.settings=settings;
    }
    
    public Long getId(){
    	return id;
    }
    
    public void setId(Long id){
    	this.id = id;
    }
    
    public String getEmail(){
    	return email;
    }
    
    public void setEmail(String email){
    	this.email = email;
    }
    
    public String getName(){
    	return name;
    }
    
    public void setName(String name){
    	this.name = name;
    }
    
    public String getPhone(){
    	return phone;
    }
    
    public void setPhone(String phone){
    	this.phone = phone;
    }
    
    public Object getRating(){
    	return rating;
    }
    
    public void setRating(Object rating){
    	this.rating = rating;
    }
    
    public Object getSettings(){
    	return settings;
    }
    
    public void setSettings(Object settings){
    	this.settings = settings;
    }
    
    //I don´t know how to reference objects ;/
    //http://docs.oracle.com/javase/7/docs/api/java/lang/String.html
    @Override
    public String toString(){
    	return String.format(
    			"Profile[email=%s, name=%s, phone=%s]", 
    			email, name, phone);
    }
}