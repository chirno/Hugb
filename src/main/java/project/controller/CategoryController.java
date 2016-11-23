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
}