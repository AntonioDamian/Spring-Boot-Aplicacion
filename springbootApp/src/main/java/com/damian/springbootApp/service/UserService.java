package com.damian.springbootApp.service;



import org.springframework.stereotype.Service;

import com.damian.springbootApp.Excepciones.UsernameOrIdNotFound;
import com.damian.springbootApp.dto.ChangePasswordForm;
import com.damian.springbootApp.entity.User;

@Service
public interface UserService {
	
	public Iterable<User> getAllUsers();

	public User createUser( User user) throws Exception;
	
	public User getUserById( Long id) throws Exception;

	public User updateUser(User user) throws Exception;
	
	public void deleteUser(Long id) throws UsernameOrIdNotFound;
	
	public User changePassword(ChangePasswordForm form) throws Exception;
	
	
}
