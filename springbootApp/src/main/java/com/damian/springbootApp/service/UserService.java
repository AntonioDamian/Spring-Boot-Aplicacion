package com.damian.springbootApp.service;

import org.springframework.stereotype.Service;

import com.damian.springbootApp.entity.User;

@Service
public interface UserService {
	
	public Iterable<User> getAllUsers();
}
