package project.persistence.entities;

public class Account{
	
	// Declare that this attribute is the id
    
    private long id;
    
    
    private String email;
    private String name;
    private String phone;
    private	String password;
    private Profile profile;
    public Post[][] posts;
    
    
    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public Account(){
    	
    }
    
    public Account(long id, String email, String name, String phone, String password){
    	this.id = id;
    	this.email = email;
    	this.name = name;
    	this.phone = phone;
    	this.password = password;
    	this.profile = new Profile(this.id, this.email, this.name, this.phone);
    	this.posts = new Post[1][10];
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
    
    public String getPassword(){
    	return password;
    }
    
    public void setPassword(String password){
    	this.password = password;
    }
    
    public Profile getProfile(){
    	return profile;
    }
    
    public void setProfile(Profile profile){
    	this.profile = profile;
    }
     
  //I don´t know how to reference objects ;/
   // https://en.wikipedia.org/wiki/Printf_format_string
    // Can %s display boolean??
    
    public String toString(){
    	return String.format(
    			"Account[\n\t"
    			+ "id=%d,\n\t"
    			+ "name=%s,\n\t"
    			+ "phone=%s,\n\t"
    			+ "password=%s,\n\t"
    			+ "profile=%s,\n\t"
    			+ "]", 
    			id, name, phone, password, profile);
    }
}