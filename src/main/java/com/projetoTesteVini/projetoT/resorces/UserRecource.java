package com.projetoTesteVini.projetoT.resorces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoTesteVini.projetoT.entities.User;

@RestController
public class UserRecource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"maria","maria@gmail.com","999999999","12345");
		return ResponseEntity.ok().body(u);
	}

}
