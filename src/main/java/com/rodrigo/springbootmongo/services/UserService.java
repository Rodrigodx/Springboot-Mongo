package com.rodrigo.springbootmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.rodrigo.springbootmongo.domain.User;
import com.rodrigo.springbootmongo.dto.UserDTO;
import com.rodrigo.springbootmongo.repository.UserRepository;
import com.rodrigo.springbootmongo.services.exception.ObjectNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
	
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado"));

	}
	
	public User insert(User obj) {
		return userRepository.insert(obj);
	}
	
	
	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}
	
}
