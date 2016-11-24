package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import project.persistence.entities.Account;
import project.persistence.entities.Category;
import project.service.CategoryService;
import project.service.PostService;


@Controller
public class CategoryController {

	//Instance Variables
	CategoryService categoryService;
	PostService postService;

	//Dependency Injection
	@Autowired
	public CategoryController(CategoryService categoryService, PostService postService){
		this.categoryService = categoryService;
		this.postService = postService;
	}
	
	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public String viewCategories(Model model){
	
		model.addAttribute("category", new Category());
			
		model.addAttribute("savedCategories", categoryService.findAll());
		
		return "categories/Categories";
	}
	
	@RequestMapping(value = "/categories/{name}", method = RequestMethod.GET)
	public String viewPostsBelongingToCategory(@PathVariable String name, Model model){
	
		model.addAttribute("category", new Category());
			
		Category temp = categoryService.findCategoryByName(name);
		model.addAttribute("allPosts", postService.findPostsByCategory(temp));
		
		return "categories/Posts";
	}
}