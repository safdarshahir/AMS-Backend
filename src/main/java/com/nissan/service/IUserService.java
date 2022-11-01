package com.nissan.service;

import java.util.List;
import java.util.Optional;

import com.nissan.model.User;

public interface IUserService {
	
	// Find all users
	public List<User> findAllUsers();
	
	// Insert user
	public User addUser(User user);
//	
//	//Find by username and password
//	public User findByUserNameAndPassword(String userName,String password) ;
//	
//	// Find user by userId
//	//	public User find
	
	// Update user
	public User updateUser(User user);

	Optional<User> findUserById(int userId);

}
