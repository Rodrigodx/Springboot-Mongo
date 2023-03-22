package com.rodrigo.springbootmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.springbootmongo.domain.User;
import com.rodrigo.springbootmongo.dto.UserDTO;
import com.rodrigo.springbootmongo.services.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/users")
@AllArgsConstructor
public class UserResource {
	
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll(){
		List<User> list = userService.findAll();
		List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);

	}
	
}
