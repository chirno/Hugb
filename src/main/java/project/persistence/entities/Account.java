package project.persistence.entities;

import javax.persistence.*;


@Entity
@Table(name = "account")
public class Account{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // private int count;
      
    private String email;
    private String name;
    private String phone;
    private	String password;
    /*private Profile profile;
    private Post[] posts;
    */
    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public Account(){
    	
    }
    
    public Account(Long id, String email, String name, String phone, String password){
    	this.id = id;
    	this.email = email;
    	this.name = name;
    	this.phone = phone;
    	this.password = password;
    	/*this.profile = new Profile(this.id, this.email, this.name, this.phone);
    	this.posts = new Post[5];
    	this.count = 0;*/
    }
    
    //--------------------Id-----------------------------------
    
    public Long getId(){
    	return id;
    }
    
    public void setId(Long id){
    	this.id = id;
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
    
    //---------------------Password-----------------------------------
    
    public String getPassword(){
    	return password;
    }
    
    public void setPassword(String password){
    	this.password = password;
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
    			+ "id=%d,\n\t"
    			+ "name=%s,\n\t"
    			+ "phone=%s,\n\t"
    			+ "password=%s,\n\t"
    			+ "profile=%s,\n\t"
    			+ "posts=%s\n\t"
    			+ "]", 
    			id, name, phone, password );
    }
}