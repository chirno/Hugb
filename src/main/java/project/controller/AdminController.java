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
	
	//------------------------------------------------------------------------------
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminIndexPage(Model model){
		model.addAttribute("account", new Account());
		
		return "admin/Index";
	}
	
	//------------------------------------------------------------------------------

	@RequestMapping(value = "/admin/categories", method = RequestMethod.GET)

	public String adminViewCategoryPage(Model model){
		model.addAttribute("category", new Category());
		
		model.addAttribute("savedCategories", categoryService.findAll());
		
		return "admin/Categories";
	}
	
	//------------------------------------------------------------------------------
	
	@RequestMapping(value = "/admin/categories/create", method = RequestMethod.GET)

	public String adminViewCategoryCreationPage(Model model){
		model.addAttribute("category", new Category());
		
		model.addAttribute("savedCategories", categoryService.findAll());
		
		return "admin/categories/Create";
	}
	
	@RequestMapping(value = "/admin/categories/create", method = RequestMethod.POST)
	public String adminCreateCategory(@ModelAttribute("category") Category category,
                                     Model model){

		// Save the Category that we received from the form
		categoryService.save(category);
        
		model.addAttribute("savedCategories", categoryService.findAll());

		// Return the view
		return "admin/categories/Create";
	}
	
	//------------------------------------------------------------------------------

	@RequestMapping(value = "/admin/categories/delete", method = RequestMethod.GET)

	public String adminViewCategoryDeletionPage(Model model){
		model.addAttribute("category", new Category());
		
		model.addAttribute("savedCategories", categoryService.findAll());
		
		return "admin/categories/Delete";
	}
	
	@RequestMapping(value = "/admin/categories/delete", method = RequestMethod.POST)
	public String adminDeleteCategory(@ModelAttribute("category") Category category,
                                     Model model){

		categoryService.delete(category.getId());  
		

		model.addAttribute("savedCategories", categoryService.findAll());
        
		// Return the view
		return "admin/categories/Delete";
	}
	//------------------------------------------------------------------------------
	
	@RequestMapping(value = "/admin/accounts", method = RequestMethod.GET)
	public String adminViewAccountPage(Model model){
		model.addAttribute("account", new Account());
		
		model.addAttribute("savedAccounts", accountService.findAll());
		
		return "admin/Accounts";
	}
	
	//------------------------------------------------------------------------------
	
	@RequestMapping(value = "/admin/accounts/create", method = RequestMethod.GET)
	public String adminViewAccountCreationPage(Model model){
		model.addAttribute("account", new Account());
		
		model.addAttribute("savedAccounts", accountService.findAll());
		
		return "admin/accounts/Create";
	}
	
	@RequestMapping(value = "/admin/accounts/create", method = RequestMethod.POST)
	public String adminCreateAccount(@ModelAttribute("account") Account account,
                                     Model model){

		// Save the Category that we received from the form
		accountService.save(account);
        
		model.addAttribute("savedAccounts", accountService.findAll());      
        
		// Return the view
		return "admin/accounts/Create";
	}
	
	//------------------------------------------------------------------------------
	
	@RequestMapping(value = "/admin/accounts/delete", method = RequestMethod.GET)
	public String adminViewAccountDeletionPage(Model model){
		model.addAttribute("account", new Account());
		
		model.addAttribute("savedAccounts", accountService.findAll());
		
		return "admin/accounts/Delete";
	}
	
	@RequestMapping(value = "/admin/accounts/delete", method = RequestMethod.POST)
	public String adminDeleteAccount(@ModelAttribute("account") Account account,
                                     Model model){

		// Delete the Account that we receive
		accountService.delete(account.getUsername());
        
		//model.addAttribute("savedAccounts", accountService.findAll());
		
		model.addAttribute("errorMessage", new ErrorMessage("Delete Successful!"));      
        
		// Return the view
		return "admin/accounts/Delete";
	}
	
	//------------------------------------------------------------------------------
	
}