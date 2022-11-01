package com.nissan.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.User;

@Repository
public interface IUserRepository extends JpaRepositoryImplementation<User, Integer> {
	
	public User findByUserName(String userName);
	
	// Custom retrieve username and password
	@Query("from User where userName=?1 and userPass=?2 and isActive=true")
	public User findByUserNameAndPassword(String userName,String password);

	@Query("from User where userId=?1 and isActive=true")
	public User findByUserId(int userId);

	public Optional<User> findAllById(int userId);
}
