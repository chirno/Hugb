package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Category;
import project.service.CategoryService;

@Controller
public class CategoryController {

	//Instance Variables
	CategoryService categoryService;

	//Dependency Injection
	@Autowired
	public CategoryController(CategoryService categoryService){
		this.categoryService = categoryService;
	}

	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public String categoryPage(Model model){
		model.addAttribute("category", new Category());
		
		model.addAttribute("savedCategories", categoryService.findAll());
		
		return "categories/Categories";
	}
	
	 @RequestMapping(value = "/categories", method = RequestMethod.POST)
	    public String categoryViewCategory(@ModelAttribute("category") Category category,
	                                     Model model){

	        // Save the Category that we received from the form
	        categoryService.save(category);
	        
	        model.addAttribute("savedCategories", categoryService.findAll());

	        //model.addAttribute("category", new Category());        
	        
	        // Return the view
	        return "categories/Categories";
	    }
}