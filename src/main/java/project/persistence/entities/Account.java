package project.persistence.entities;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "account")
public class Account{

   
    private Long id;
    
    private String username;
    private	String password;
    private Profile profile;
    private Set<Post> posts;
    
    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public Account(){
    	
    }
    
    public Account(String username, String password, String email, String name, String phone){
    	this.username = username;
    	this.password = password;
    }
    
    //--------------------Id-----------------------------------
    @Column(name = "AccountId", unique = true, nullable = false)
    public Long getId(){
    	return id;
    }
    
    public void setId(Long id){
    	this.id = id;
    }
    
    //--------------------Username-----------------------------------
    @Id
    public String getUsername(){
    	return username;
    }
    
    public void setUsername(String username){
    	this.username = username;
    }
    
//--------------------Password-----------------------------------
    
    public String getPassword(){
    	return password;
    }
    
    public void setPassword(String password){
    	this.password = password;
    }
    
    //-----------------------Profile----------------------------------
    @Embedded
    public Profile getProfile(){
    	return profile;
    }
    
    public void setProfile(Profile profile){
    	this.profile = profile;
    }
    
    //------------------------Posts-------------------------------------
   @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    public Set<Post> getPosts(){
    	return posts;
    }
    
    public void setPosts(Set<Post> posts){
    	this.posts = posts;
    }
    
   
  //I don´t know how to reference objects ;/
   // https://en.wikipedia.org/wiki/Printf_format_string
    // Can %s display boolean??
    
    public String toString(){
    	return String.format(
    			"Account[\n\t"
    			+ "id=%d,\n\t"
    			+ "username=%s,\n\t"
    			+ "password=%s,\n\t"
    			+ "profile=%s,\n\t"
    			+ "]", 
    			id, username, password, profile);
    }
}