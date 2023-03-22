package com.rodrigo.springbootmongo.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	private String id;
	private String name;
	private String email;
	
}
