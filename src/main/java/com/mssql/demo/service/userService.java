package com.mssql.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mssql.demo.model.user;
import com.mssql.demo.repository.UserRepository;

@Service
public class userService {

@Autowired
private UserRepository userRepository;

	public String findNumberOfUsers(int id) {
		return userRepository.find(id);
	}
}
