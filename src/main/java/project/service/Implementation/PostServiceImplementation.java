package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Post;
import project.persistence.entities.Account;
import project.persistence.entities.Category;
import project.persistence.repositories.PostRepository;
import project.service.PostService;

import java.util.Collections;
import java.util.List;

@Service
public class PostServiceImplementation implements PostService {

    // Instance Variables
    PostRepository repository;

    // Dependency Injection
    @Autowired
    public PostServiceImplementation(PostRepository repository) {
        this.repository = repository;
    }

    @Override
    public  boolean save(Post post) {
        if(!this.exists(post.getId())){
        	repository.save(post);
        	return true;
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
    	if(this.exists(id)){
        	repository.delete(id);
        	return true;
        }
        return false;
    }

    @Override
    public boolean exists(Long id) {
        if(id == null){
        	return false;
        }
    	return repository.exists(id);
    }
    
    @Override
    public List<Post> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Post> findAllReverseOrder() {
        // Get all the Posts.
        List<Post> posts = repository.findAll();

        // Reverse the list
        Collections.reverse(posts);

        return posts;
    }

    @Override
    public Post findOne(Long id) {
        return repository.findOne(id);
    }
    
    @Override
    public List<Post> findPostsByAccount(Account account){
    	List<Post> posts = repository.findPostsByAccount(account);
    	
    	Collections.reverse(posts);
    	
    	return posts;
    }
    @Override
    public List<Post> findPostsByCategory(Category category){
    	List<Post> posts = repository.findPostsByCategory(category);
    	
    	Collections.reverse(posts);
    	
    	return posts;
    }
}
