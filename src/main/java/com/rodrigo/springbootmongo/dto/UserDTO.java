package com.rodrigo.springbootmongo.dto;

import java.io.Serializable;

import com.rodrigo.springbootmongo.domain.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO (User obj){
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}
	
}
