package com.telly.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.telly.dao.FormValidationGroup;
import java.security.Principal;
import java.util.List;
import com.telly.service.UserService;


import com.telly.dao.User;


@Controller
public class HomeController {
	@RequestMapping("/")
	public String showHome() {
		
		return "home";
	}
	}



}
