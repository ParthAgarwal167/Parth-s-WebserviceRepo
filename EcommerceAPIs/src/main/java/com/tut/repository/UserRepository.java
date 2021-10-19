package com.tut.repository;

import org.springframework.data.repository.CrudRepository;

import com.tut.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	public User findById(int id);
}
