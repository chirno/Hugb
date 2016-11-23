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