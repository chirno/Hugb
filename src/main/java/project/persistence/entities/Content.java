package project.persistence.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Content")
public class Content{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String[] comments;
	private Date date;
	private String email;
	private String phone;
	private Double price;
	private Double rating;
	private String title;
	
	public Content(){
		
	}
	
	public Content(	String[] comments, Date date, String email,
					String phone, Double price, Double rating,
					String title){
		this.comments = comments;
		this.date = date;
		this.email = email;
		this.phone = phone;
		this.price = price; 
		this.rating = rating;
		this.title = title;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public String[] getComments(){
		return comments;
	}
	
	public void setComments(String[] comments){
		this.comments = comments;
	}
	
	public Date getDate(){
		return date;
	}
	
	public void setDate(Date date){
		this.date = date;
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
	
	public Double getPrice(){
		return price;
	}
	
	public void setPrice(Double price){
		this.price = price;
	}
	
	public Double getRating(){
		return rating;
	}
	
	public void setRating(Double rating){
		this.rating = rating;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
}