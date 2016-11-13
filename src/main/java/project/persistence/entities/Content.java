package project.persistence.entities;

import java.util.Arrays;

import javax.persistence.*;

@Entity
@Table(name = "content")
public class Content{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String[] comments;
	private String email;
	private String phone;
	private double price;
	private double rating;
	private String title;
	
	public Content(){
		
	}
	
	public Content(	String[] comments, String email,
					String phone, double price, double rating,
					String title){
		this.comments = comments;
		this.email = email;
		this.phone = phone;
		this.price = price; 
		this.rating = rating;
		this.title = title;
	}
	
	public long getId(){
		return id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public String[] getComments(){
		return comments;
	}
	
	public void setComments(String[] comments){
		this.comments = comments;
	}

	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getRating(){
		return rating;
	}
	
	public void setRating(double rating){
		this.rating = rating;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String toString(){
    	return String.format(
    			"Content[\n\t"
    			+ "comments=%s,\n\t"
    			+ "email=%s,\n\t"
    			+ "phone=%s,\n\t"
    			+ "price=%f\n\t"
    			+ "rating=%f\n\t"
    			+ "title=%s\n\t"
    			+ "]", 
    			Arrays.deepToString(comments), email, phone, price, rating, title);
    }
}