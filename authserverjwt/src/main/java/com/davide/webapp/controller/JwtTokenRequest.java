package com.davide.webapp.controller;

import java.io.Serializable;

import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
public class JwtTokenRequest implements Serializable {

	private static final long serialVersionUID = -5616176897013108345L;

	@NotBlank(message = "username non puo essere vuoto")
	private String username;
	@NotBlank(message = "la password non puo essere vuota")
	private String password;

}
