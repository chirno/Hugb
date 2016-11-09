package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "Account")
public class Account{
	
	// Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private	String password;
    private Object profile;
    private Object flag;
    
    // Notice the empty constructor, because we need to be able to create an empty PostitNote to add
    // to our model so we can use it with our form
    public Account(){
    	
    }
    
    public Account(String password, Object profile,
    				Object flag){
    	this.password = password;
    	this.profile = profile;
    	this.flag = flag;
    }
    
    public Long getId(){
    	return id;
    }
    
    public void setId(Long id){
    	this.id = id;
    }
    
    public String getpassword(){
    	return password;
    }
    
    public void setpassword(String password){
    	this.password = password;
    }
    
    public Object getprofile(){
    	return profile;
    }
    
    public void setprofile(Object profile){
    	this.profile = profile;
    }
    
    public Object getflag(){
    	return flag;
    }
    
    public void setflag(Boolean flag){
    	this.flag = flag;
    }
    
  //I don´t know how to reference objects ;/
   // https://en.wikipedia.org/wiki/Printf_format_string
    // Can %s display boolean??
    @Override
    public String toString(){
    	return String.format(
    			"Account[password=%s,"
    			+ "profile=%s,"
    			+ "flag=%s]", 
    			password, profile, flag);
    }
}