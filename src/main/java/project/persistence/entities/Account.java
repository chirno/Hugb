package project.persistence.entities;

import javax.persistence.*;


@Entity
@Table(name = "account")
public class Account{

	@Id
	private String username;
    private	String password;
    
    private String email;
    private String name;
    private String phone;
    
    /*private Profile profile;
    private Post[] posts;
    */
    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public Account(){
    	
    }
    
    public Account(String username, String password, String email, String name, String phone){
    	this.username = username;
    	this.password = password;
    	this.email = email;
    	this.name = name;
    	this.phone = phone;
    }
    
 //--------------------Username-------------------------------
    
    public String getUsername(){
    	return username;
    }
    
    public void setUsername(String username){
    	this.username = username;
    }
    
 //---------------------Password-----------------------------------
    
    public String getPassword(){
    	return password;
    }
    
    public void setPassword(String password){
    	this.password = password;
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
    
   
    //-----------------------Profile----------------------------------
    
   /* public Profile getProfile(){
    	return profile;
    }
    
    public void setProfile(Profile profile){
    	this.profile = profile;
    }
    */
    //------------------------Posts-------------------------------------
    
   /* public void createPost(Category category, Content content){
    	Post ourPost = new Post(category, content);
    	try
    	{
    		this.insertPost(ourPost);
    	}
    	catch (ArrayIndexOutOfBoundsException e)
    	{
    		System.out.println("You shall not post!");
    		System.exit(1);
    	}
    	System.out.println("Success");
    }
    
    public Post[] getPosts(){
    	return posts;
    }
    
    public void setPosts(Post[] posts){
    	this.posts = posts;
    }
    
    public void insertPost(Post post){
    	this.posts[this.count] = post;
    	this.incrementCount();
    }
    */
    //---------------------Count----------------------------------
    
    /*public int getCount(){
    	return count;
    }
    
    public void setCount(int count){
    	this.count = count;
    }
    
    public void incrementCount(){
    	this.count++;
    }
    
    public void decrementCount(){
    	this.count--;
    }*/
     
  //I don´t know how to reference objects ;/
   // https://en.wikipedia.org/wiki/Printf_format_string
    // Can %s display boolean??
    
    public String toString(){
    	return String.format(
    			"Account[\n\t"
    			+ "username=%s,\n\t"
    			+ "password=%s,\n\t"
    			+ "email=%s,\n\t"
    			+ "name=%s,\n\t"
    			+ "phone=%s,\n\t"
    			+ "]", 
    			username, password, email, name, phone);
    }
}