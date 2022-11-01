package com.nissan.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.nissan.model.User;
import com.nissan.repo.IUserRepository;

@Service
public class LoginService implements UserDetailsService {
	
	@Autowired
	private IUserRepository userRepo;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;

	
	public User save (User user) {
		User newUser = new User();
		newUser.setUserName(user.getUserName());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		newUser.setAge(user.getAge());
		newUser.setGender(user.getGender());
		newUser.setAddress(user.getAddress());
		newUser.setPhoneNumber(user.getPhoneNumber());
		return userRepo.save(newUser);
	}

	public User findByUsername(String userName) {
		return userRepo.findByUserName(userName);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 //custom method
		User user = userRepo.findByUserName(username);

		if(user==null) {
			throw new UsernameNotFoundException("User is not found with the name"+username);
		}
		
		System.out.println(user.getPassword());
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),new ArrayList<>());
		
	}
	
	
}
