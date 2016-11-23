package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "post") // If you want to specify a table name, you can do so here
public class Post{

	// Declare that this attribute is the id
    
	private Long id;
	
	private Category category;
	private String content;
	private Account account;
	
	public Post(){
		
	}
	
	public Post(String content){
		this.content = content;
	}
	
	//-------------------------Id----------------------------
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PostId", unique = true, nullable = false)
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	//-----------------------String---------------------------
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CategoryId", nullable = false)
	public Category getCategory(){
		return category;
	}
	
	public void setCategory(Category category){
		this.category = category;
	}
	
	//----------------------String-----------------------------
	
	public String getContent(){
		return content;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	//----------------------------------------------------------
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AccountId", nullable = false)
	public Account getAccount(){
		return account;
	}
	
	public void setAccount(Account account){
		this.account = account;
	}
	
	
	//----------------------------------------------------------
	
	public String toString(){
    	return String.format(
    			"\n\t\tPost[category=%s, content=%s]\n\t", 
    			category, content);
    }
	
}