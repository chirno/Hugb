package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.*;
import project.service.*;


@Controller
public class AdminController {

	//Instance Variables
	AccountService accountService;
	CategoryService categoryService;
	PostService postService;

	//Dependency Injection
	@Autowired
	public AdminController(AccountService accountService, CategoryService categoryService, PostService postService) {
        this.accountService = accountService;
        this.categoryService = categoryService;
        this.postService = postService;
    }
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminIndexPage(Model model){
		model.addAttribute("account", new Account());
		
		return "admin/Index";
	}
	

	@RequestMapping(value = "admin/categories", method = RequestMethod.GET)

	public String adminViewCategoriesPage(Model model){
		model.addAttribute("category", new Category());
		
		model.addAttribute("savedCategories", categoryService.findAll());
		
		return "admin/Categories";
	}
	
	@RequestMapping(value = "admin/categories", method = RequestMethod.POST)
	public String adminCreateCategory(@ModelAttribute("category") Category category,
                                     Model model){

		// Save the Category that we received from the form
		categoryService.save(category);
        
		model.addAttribute("savedCategories", categoryService.findAll());

		//model.addAttribute("category", new Category());        
        
		// Return the view
		return "admin/Categories";
	}
	
	@RequestMapping(value = "admin/accounts", method = RequestMethod.GET)
	public String adminViewAccountsPage(Model model){
		model.addAttribute("account", new Category());
		
		model.addAttribute("savedAccounts", accountService.findAll());
		
		return "admin/Accounts";
	}
	
	@RequestMapping(value = "admin/accounts", method = RequestMethod.POST)
	public String adminCreateAccount(@ModelAttribute("account") Account account,
                                     Model model){

		// Save the Category that we received from the form
		accountService.save(account);
        
		model.addAttribute("savedAccount", accountService.findAll());

		//model.addAttribute("category", new Category());        
        
		// Return the view
		return "admin/Accounts";
	}
	
	/*@RequestMapping(value = "admin/accounts", method = RequestMethod.POST)
	public String adminDeleteAccountWithUsername(@ModelAttribute("account") Account account,
                                     Model model){

		// Delete the Account that we receive
		accountService.deleteWithUsername(account.getUsername());
        
		model.addAttribute("errorMessage", new ErrorMessage("Delete Successful!"));

		//model.addAttribute("category", new Category());        
        
		// Return the view
		return "admin/Accounts";
	}*/
	
	
}