package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "profile")
public class Profile{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    private String email;
    private String name;
    private String phone;
    private double rating;
    private String settings;
    
    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public Profile(){
    	
    }
    
    public Profile(	Long id, String email, String name, 
    				String phone, double rating, String settings){
    	this.id = id;
    	this.email=email;
    	this.name=name;
    	this.phone=phone;
    	this.rating = rating;
    	this.settings = settings;
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
    
    public double getRating(){
    	return rating;
    }
    
    public void setRating(double rating){
    	this.rating = rating;
    }
    
    public String getSettings(){
    	return settings;
    }
    
    public void setSettings(String settings){
    	this.settings = settings;
    }
      
    public String toString(){
    	return String.format(
    			"Profile[\n\t"
    			+ "id=%d,\n\t"
    			+ "email=%s,\n\t"
    			+ "name=%s,\n\t"
    			+ "phone=%s,\n\t"
    			+ "rating=%s,\n\t"
    			+ "settings=%s,\n\t"
    			+ "]", 
    			id, email, name, phone, rating, settings);
    }
}