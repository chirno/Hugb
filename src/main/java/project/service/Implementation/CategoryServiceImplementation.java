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
    public  Category save(Category category) {
        return repository.save(category);
    }
    
    public void delete(Long id){
    	repository.delete(id);
    }
    
    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }
}
