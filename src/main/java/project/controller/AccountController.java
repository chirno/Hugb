package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Account;
import project.service.AccountService;

@Controller
public class AccountController {

	//Instance Variables
	AccountService accountService;

	//Dependency Injection
	@Autowired
	public AccountController(AccountService accountService){
		this.accountService = accountService;
	}

	@RequestMapping(value = "/accounts", method = RequestMethod.GET)
	public String getAccounts(Model model){
		model.addAttribute("account", new Account());
		
		model.addAttribute("savedAccounts", accountService.findAll());
		
		return "/Accounts";
	}
	
	 @RequestMapping(value = "/accounts", method = RequestMethod.POST)
	    public String createAccount(@ModelAttribute("account") Account account,
	                                     Model model){

	        // Save the Account that we received from the form
	        accountService.save(account);
	        
	        model.addAttribute("savedAccounts", accountService.findAll());

	        // Return the view
	        return "/Accounts";
	    }
}