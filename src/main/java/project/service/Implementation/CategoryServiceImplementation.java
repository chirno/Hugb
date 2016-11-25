package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Category;
import project.persistence.repositories.CategoryRepository;
import project.service.CategoryService;

import java.util.Collections;
import java.util.List;

@Service
public class CategoryServiceImplementation implements CategoryService {

    // Instance Variables
    CategoryRepository repository;

    // Dependency Injection
    @Autowired
    public CategoryServiceImplementation(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public  boolean save(Category category) {
        if(!this.exists(category.getId())){
        	repository.save(category);
        	return true;
        }
        return false;
    }
    
    @Override
    public boolean delete(Long id){
    	if(this.exists(id)){
    		repository.delete(id);
    		return true;
    	}
    	return false;
    }
    
    @Override
    public boolean exists(Long id){
    	if(id == null){
    		return false;
    	}
    	return repository.exists(id);
    }
    
    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }
    
    @Override
    public Category findCategoryByName(String name){   	
    	
    	return repository.findCategoryByName(name);
    	
    }
}
