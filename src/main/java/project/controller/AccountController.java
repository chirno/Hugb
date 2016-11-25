package project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.*;
import project.service.AccountService;
import project.service.PostService;
import project.service.CategoryService;
import javax.servlet.http.HttpSession;

@Controller
public class AccountController {

	//Instance Variables
		AccountService accountService;
		PostService postService;
		CategoryService categoryService;

		//Dependency Injection
		@Autowired
		public AccountController(AccountService accountService, PostService postService, CategoryService categoryService) {
	        this.accountService = accountService;
	        this.postService = postService;
	        this.categoryService = categoryService;
	    }
		
		//------------------------------------------------------------------------------

		//This method delegates the task of logging in a user to the userService class.
	    @RequestMapping(value = "/logout", method = RequestMethod.GET)
	    public String userLogout(HttpSession session, Model model) {
	        //If the submitted username and password match, then log the user in.
	        
	    	

			model.addAttribute("allPosts", postService.findAllReverseOrder());
	    	session.invalidate();
	    	return "Index";
	    }
	    
	  //------------------------------------------------------------------------------
	    
	    @RequestMapping(value = "/account/posts", method = RequestMethod.GET)

		public String accountViewPostPage(Model model, HttpSession session){
			model.addAttribute("post", new Post());

			Account temp = new Account((Account)session.getAttribute("account"));
			model.addAttribute("myPosts", postService.findPostsByAccount(temp));
			
			return "account/Posts";
		}
	    
	  //------------------------------------------------------------------------------
	    
	    @RequestMapping(value = "/account/posts/create", method = RequestMethod.GET)

		public String accountViewPostCreationPage(Model model, HttpSession session){
			model.addAttribute("post", new Post());
			model.addAttribute("content", new Content());
			
			Account temp = new Account((Account)session.getAttribute("account"));
			model.addAttribute("myPosts", postService.findPostsByAccount(temp));
			
			return "account/posts/Create";
		}
	    
	  //------------------------------------------------------------------------------
	    
	    @RequestMapping(value = "/account/posts/create", method = RequestMethod.POST)
		public String accountCreatePost(@ModelAttribute("content") Content content, Model model, HttpSession session){
	    	model.addAttribute("content", new Content());
	    	
	    	Category tempCategory = categoryService.findCategoryByName(content.getCategoryName());
			Account tempAccount = new Account((Account)session.getAttribute("account"));
		
			Post ourPost = new Post(content.getPostContent());
			ourPost.setAccount(tempAccount);
			ourPost.setCategory(tempCategory);
	    	postService.save(ourPost);

			model.addAttribute("myPosts", postService.findPostsByAccount(tempAccount));
			
			// Return the view
			return "account/posts/Create";
		}
	    
	  //------------------------------------------------------------------------------
	    
	    @RequestMapping(value = "/account/posts/delete", method = RequestMethod.GET)

		public String accountViewPostDeletionPage(Model model, HttpSession session){
			model.addAttribute("post", new Post());

			Account temp = new Account((Account)session.getAttribute("account"));
			model.addAttribute("myPosts", postService.findPostsByAccount(temp));
			
			return "account/posts/Delete";
		}
	    
	  //------------------------------------------------------------------------------
	    
	    @RequestMapping(value = "/account/posts/delete", method = RequestMethod.POST)
		public String accountDeletePost(@ModelAttribute("post") Post post,
	                                     Model model, HttpSession session){

			// Save the Category that we received from the form
			postService.delete(post.getId());

			Account temp = new Account((Account)session.getAttribute("account"));
			model.addAttribute("myPosts", postService.findPostsByAccount(temp));
			
			// Return the view
			return "account/posts/Delete";
		}
}