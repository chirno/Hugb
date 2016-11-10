package project.persistence.entities;

public class Profile{
	
    private long id;
    
    private String email;
    private String name;
    private String phone;
    private Rating rating;
    private Settings settings;
    
    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public Profile(){
    	
    }
    
    public Profile(	long id, String email, String name, 
    				String phone){
    	this.id = id;
    	this.email=email;
    	this.name=name;
    	this.phone=phone;
    	this.rating = new Rating(this.id);
    	this.settings = new Settings(this.id);
    }
    
    public long getId(){
    	return id;
    }
    
    public void setId(long id){
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
    
    public Rating getRating(){
    	return rating;
    }
    
    public void setRating(Rating rating){
    	this.rating = rating;
    }
    
    public Settings getSettings(){
    	return settings;
    }
    
    public void setSettings(Settings settings){
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