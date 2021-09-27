package com.resto.management.app.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Resto {
	
	private Integer id;
	@NotBlank(message = "The city is required.")
	private String name;
	@NotNull
	private String address;
	private String email;

}
