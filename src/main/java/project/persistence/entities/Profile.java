package project.persistence.entities;




public class Profile{
	
	
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
    
  
    public String toString(){
    	return String.format(
    			"Profile[email=%s, name=%s, phone=%s]", 
    			email, name, phone);
    }
}