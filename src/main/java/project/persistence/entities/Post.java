package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "post") // If you want to specify a table name, you can do so here
public class Post{

	// Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "post_id")
    private Long id;
	
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="username")
    private Account account;
    
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id")
	private Category category;
    
	private String content;
	
	public Post(){
		
	}
	
	public Post(String content){
		this.content = content;
	}
	
	//-------------------------Id----------------------------
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	//-----------------------String---------------------------
	
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
	
	//----------------------Username-----------------------------
	
		public Account getAccount(){
			return account;
		}
		
		public void setAccount(Account account){
			this.account = account;
		}
	
	//----------------------------------------------------------
	
	/*public String toString(){
    	return String.format(
    			"\n\t\tPost[category=%s, content=%s]\n\t", 
    			category, content);
    }*/
	
}