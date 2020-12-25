package com.damian.springbootApp.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.damian.springbootApp.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

	
	public Set findByUsername(String username);
	
	public Set findByIdAndPassword(Long id, String password);
}
