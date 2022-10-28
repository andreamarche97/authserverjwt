package com.davide.webapp.security;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import com.davide.webapp.model.User;
import com.davide.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService
{
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("user not found"));

		return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(), new ArrayList<>());
	}
	
	
	
	
	
	
}
	