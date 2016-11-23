package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Post;
import project.service.PostService;

@Controller
public class PostController {

    // Instance Variables
    PostService postService;

    // Dependency Injection
    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    // Method that returns the correct view for the URL /post/post
    // This handles the GET request for this URL
    // Notice the `method = RequestMethod.GET` part
    @RequestMapping(value = "/post", method = RequestMethod.GET)
    public String postViewGet(Model model){

        // Add a new Post to the model for the form
        // If you look at the form in Post.jsp, you can see that we
        // reference this attribute there by the name `post`.
        model.addAttribute("post",new Post());

        // Here we get all the Posts (in a reverse order) and add them to the model
        model.addAttribute("posts",postService.findAllReverseOrder());

        // Return the view
        return "admin/Posts";
    }

    // Method that receives the POST request on the URL /postit
    // and receives the ModelAttribute("post")
    // That attribute is the attribute that is mapped to the form, so here
    // we can save the postit note because we get the data that was entered
    // into the form.
    // Notice the `method = RequestMethod.POST` part
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String postViewPost(@ModelAttribute("post") Post post,
                                     Model model){

        // Save the Postit Note that we received from the form
        postService.save(post);

        // Here we get all the Postit Notes (in a reverse order) and add them to the model
        model.addAttribute("posts", postService.findAllReverseOrder());

        // Add a new Postit Note to the model for the form
        // If you look at the form in Posts.jsp, you can see that we
        // reference this attribute there by the name `post`.
        model.addAttribute("post", new Post());

        // Return the view
        return "admin/Posts";
    }

    
	
}
