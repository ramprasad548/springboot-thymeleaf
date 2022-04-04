package com.example.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.thymeleaf.model.Contact;
import com.example.thymeleaf.service.ContactService;

@Controller
public class ThymeleafController {

	@Autowired
	private ContactService contactService;

	@RequestMapping(value = "/list_contact")
	public String userInfo(Model model) throws Exception {

		 List<Contact> listContact = new ArrayList<>();
         
	        listContact.add(new Contact("Marry John", "marry.john@gmail.com", "USA"));
	        listContact.add(new Contact("Tom Smith", "tomsmith@outlook.com", "England"));
	        listContact.add(new Contact("John Purcell", "john123@yahoo.com", "Australia"));
	        listContact.add(new Contact("Siva Krishna", "sivakrishna@gmail.com", "India"));
	        
	        model.addAttribute("contacts", listContact);       
	         
	        return "contact";
	        }
}
