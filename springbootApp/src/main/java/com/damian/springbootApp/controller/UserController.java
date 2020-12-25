package com.damian.springbootApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.damian.springbootApp.entity.User;
import com.damian.springbootApp.repository.RoleRepository;
import com.damian.springbootApp.service.UserService;

@Controller
public class UserController {

	@Autowired
	RoleRepository roleRepository;
	
	@Autowired 
	UserService userService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
/*	@GetMapping("/userForm")
	public String getUserForm() {
		return "user-form/user-view";
	}	*/
	
	@GetMapping("/userForm")
	public String getUserForm(Model model) {
		model.addAttribute("userForm", new User());
		model.addAttribute("roles",roleRepository.findAll());
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("listTab","active");
		return "user-form/user-view";
	}
	
	
}
