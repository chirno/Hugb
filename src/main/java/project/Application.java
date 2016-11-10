package project;

import project.persistence.entities.*;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The main class of the project.
 * By running the main class of {@link Application} then you start the Spring Boot system
 */
@SpringBootApplication
@EnableJpaRepositories
public class Application extends SpringBootServletInitializer{

	
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
        return applicationBuilder.sources(Application.class);
    }
    
    

    public static void main(String[] args) {
    	
    	int categoryId = 0;
    	//long accountId = 0;
    	
        //SpringApplication.run(Application.class,args);
    	
    	
    	
    	Category books = new Category(categoryId,"books");
    	
        Account test = new Account( "netfang","nafn","simi","lykilord");
        String[] comments = new String[10];
        double price = 200.00;
        String title = "Tuo";
        Content stuff = new Content(comments,test.getEmail(), test.getPhone(), price, test.getProfile().getRating().getRating(), title);
        
        
    	//Profile test = new Profile(1, "netfang", "nafn", "simi");
    	//Rating test = new Rating();
    	//Comments test = new Comments();
        for(int i = 0; i < 5; i++){
        	//Content content = new Content(test.fillContent());
        	test.createPost(books, stuff);
        }
        
        
        //Post testing = new Post(100, films);
        //test.createPost(books, content);
    	System.out.println(test);
    	
        
    }

}
