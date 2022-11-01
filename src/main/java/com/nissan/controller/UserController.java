package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.User;
import com.nissan.service.IUserService;
import com.nissan.service.LoginService;

@CrossOrigin
@RestController
@RequestMapping("api/")			// works on all
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@Autowired
	LoginService loginService;
	
	//	List all users
	@GetMapping("users")
	public List<User> findAllUsers(){
		return userService.findAllUsers();
	}
	

	@PostMapping("users")
	public ResponseEntity<User> addUser(@RequestBody User user){
		System.out.println("Inserting a user record!");
		return new ResponseEntity<User> (loginService.save(user),HttpStatus.OK);
	}
	
	@PutMapping("users")
	public User updateUser(@RequestBody User user){
		System.out.println("Updating a user record!");
		userService.updateUser(user);
		return user;
	}
	
	
	
	
	
}
