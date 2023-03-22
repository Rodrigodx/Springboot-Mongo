package com.rodrigo.springbootmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.springbootmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria Silva", "maria@email.com");
		User alex = new User("1", "Alex Sousa", "alex@email.com");
		User joao = new User("1", "João Gomes", "joao@email.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex, joao));
		return ResponseEntity.ok().body(list);

	}
	
}
