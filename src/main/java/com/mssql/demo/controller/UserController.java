package com.mssql.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mssql.demo.model.user;
import com.mssql.demo.service.userService;

@RestController
public class UserController {

@Autowired
private userService service;

	@RequestMapping(value="/find", method = RequestMethod.POST)
	public String endSession(@RequestBody String id){
		System.out.println("Input is : "+id);
		return service.findNumberOfUsers(Integer.parseInt(id));
	    }
}
