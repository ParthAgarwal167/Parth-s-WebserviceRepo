package com.tut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tut.entity.User;
import com.tut.repository.UserRepository;

@Component
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	//find all user
	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}
	
	//find user by id 
	public User findById(int id) {
		return userRepository.findById(id);
	}

	//create user
	public User addUser(User user) {
		return userRepository.save(user);
	}

	//delete user
	public void deleteById(int id) {
		userRepository.deleteById(id);
	}

	//update user
	public User updateById(int id,User user) {
		user.setId(id);
		return userRepository.save(user);
	}



	

}
