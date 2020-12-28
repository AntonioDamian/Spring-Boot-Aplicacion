package com.damian.springbootApp.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.damian.springbootApp.entity.User;

@Service
public interface UserService {
	
	public Iterable<User> getAllUsers();

	public User createUser( User user) throws Exception;
	
	public User getUserById( Long id) throws Exception;

	public User updateUser(User user) throws Exception;
	
	
}
