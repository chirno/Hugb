package project.service;

import project.persistence.entities.Category;

import java.util.List;

public interface CategoryService{

	/**
     * Save a {@link Category}
     * @param Category {@link Category} to be saved
     * @return {@link Category} that was saved
     */
    boolean save(Category category);

    boolean exists(Long id);
    
    boolean delete(Long id);
    /**
     * Get all {@link Category}s
     * @return A list of {@link Category}s
     */
    List<Category> findAll();
    
    Category findCategoryByName(String name);
}