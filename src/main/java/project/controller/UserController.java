package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import project.service.AccountService;
import project.persistence.entities.Account;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

	//Instance Variables
	AccountService accountService;
	
    @Autowired
    public UserController(AccountService accountService) {
        this.accountService = accountService;
    }

 // Request mapping is the path that you want to map this method to
    // In this case, the mapping is the root "/", so when the project
    // is running and you enter "localhost:8080" into a browser, this
    // method is called
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){

        // The string "Index" that is returned here is the name of the view
        // (the Index.jsp file) that is in the path /main/webapp/WEB-INF/jsp/
        // If you change "Index" to something else, be sure you have a .jsp
        // file that has the same name
        return "Index";
    }
    
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signupForm(Model model) {
        model.addAttribute("account", new Account());
        return "signup";
    }

    //This method delegates the task of creating a new user to the userService class.
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signupSubmit(@ModelAttribute Account account) {
        //If the chosen username already exists, do nothing but inform the user that the signup failed.
        if(accountService.exists(account.getUsername())) {
            return "signup";
        }
        //If the chosen username doesn't exist, create a new user.
        else {
            accountService.save(account);
            return "login";
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm(Model model) {
        model.addAttribute("account", new Account());
        return "login";
    }

    //This method delegates the task of logging in a user to the userService class.
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginSubmit(@ModelAttribute Account account, Model model,HttpSession session) {
        //If the submitted username and password match, then log the user in.
        if(accountService.exists(account.getUsername())) {
        	if(accountService.login(account.getUsername(), account.getPassword())){
        		
        		//We also create an attribute in the session to indicate the user is logged.
        		session.setAttribute("Logged", true);
        		
        		//We associate the current session with the account object in the database.
        		session.setAttribute("Account", accountService.getOne(account.getUsername()));
        		
        		return "index";
        	}
        }
        return "login";
    }
}