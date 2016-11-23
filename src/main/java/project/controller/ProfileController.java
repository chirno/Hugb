package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Profile;
import project.service.ProfileService;

@Controller
public class ProfileController {

	//Instance Variables
	ProfileService profileService;

	//Dependency Injection
	@Autowired
	public ProfileController(ProfileService profileService){
		this.profileService = profileService;
	}

	@RequestMapping(value = "/profiles", method = RequestMethod.GET)
	public String profilePage(Model model){
		model.addAttribute("profile", new Profile());
		
		model.addAttribute("savedProfiles", profileService.findAll());
		
		return "/Profiles";
	}
	
	 /*@RequestMapping(value = "/profiles", method = RequestMethod.POST)
	    public String createProfile(@ModelAttribute("category") Profile profile,
	                                     Model model){

	        // Save the Profile that we received from the form
	        profileService.save(profile);
	        
	        model.addAttribute("savedProfiles", profileService.findAll());

	        //model.addAttribute("category", new Profile());        
	        
	        // Return the view
	        return "/Profiles";
	    }*/
}