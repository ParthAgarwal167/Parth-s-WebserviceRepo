package com.tut.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tut.entity.User;
import com.tut.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUser(){
		return this.userService.findAll();
	}
	
	@GetMapping("users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id")int id, @RequestBody User user) {
		User user1=userService.findById(id);
		if(user1==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(user1));
	}
	
	@PostMapping("/users")
	public User addAllUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable("id")int id) {
		userService.deleteById(id);
	}
	
	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable("id")int id,@RequestBody User user) {
		return userService.updateById(id,user);
	}
	
}
