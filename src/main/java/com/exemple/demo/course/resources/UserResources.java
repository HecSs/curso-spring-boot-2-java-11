package com.exemple.demo.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.demo.course.entities.User;


@RestController
@RequestMapping(value = "/users")
public class UserResources {
		
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Hector Silva", "hectorsilva@brq.com", "91650885he", "91650885");
		return ResponseEntity.ok().body(u);
		
		
	}
}
