package com.bridgeit.springrest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeit.springrest.model.User;

@RestController
public class UserController {

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<String > addUser(@RequestBody User user,  BindingResult bindingResult) {
		System.out.println(user.getEmail());
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
