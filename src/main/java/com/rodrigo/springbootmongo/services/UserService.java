package com.rodrigo.springbootmongo.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.rodrigo.springbootmongo.domain.User;
import com.rodrigo.springbootmongo.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
	
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
}
