package com.nissan.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.User;
import com.nissan.repo.IUserRepository;

@Service
public class UserServiceImp implements IUserService{
	
	//Field injection
	@Autowired
	IUserRepository userRepo;

	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		
		return (List<User>) userRepo.findAll();
	}

	

	@Transactional
	@Override
	public User addUser(User user) {
		return userRepo.save(user);
	}
	
	@Transactional
	@Override
	public User updateUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public Optional<User> findUserById(int userId){
		return userRepo.findAllById(userId);
	}


}


