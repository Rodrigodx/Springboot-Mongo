package com.rodrigo.springbootmongo.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.rodrigo.springbootmongo.domain.User;
import com.rodrigo.springbootmongo.repository.UserRepository;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class Instantiation implements CommandLineRunner {

	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
	}

}
