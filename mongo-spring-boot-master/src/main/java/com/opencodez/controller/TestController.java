package com.opencodez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opencodez.domain.Users;
import com.opencodez.repo.UserRepository;

@RestController
public class TestController {

	@Autowired
	UserRepository DAO;

	@GetMapping(value = "/getUser")

	public ResponseEntity<Users> generateClientToken() {

		//UsersPojo obj = new UsersPojo();
		Users u = DAO.findFirstByName("sibin");
		// UsersPojo o=u;

		return new ResponseEntity<>(u, HttpStatus.CREATED);
	}

}
