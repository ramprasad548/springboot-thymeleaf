package com.example.thymeleaf.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.thymeleaf.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Override
	public List<Contact> getUserData() {

		 List<Contact> listContact = new ArrayList<>();
         
	        listContact.add(new Contact("Marry John", "marry.john@gmail.com", "USA"));
	        listContact.add(new Contact("Tom Smith", "tomsmith@outlook.com", "England"));
	        listContact.add(new Contact("John Purcell", "john123@yahoo.com", "Australia"));
	        listContact.add(new Contact("Siva Krishna", "sivakrishna@gmail.com", "India"));
	        return listContact;
	}

}
