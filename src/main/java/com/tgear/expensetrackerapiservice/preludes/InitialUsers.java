package com.tgear.expensetrackerapiservice.preludes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.tgear.expensetrackerapiservice.models.User;
import com.tgear.expensetrackerapiservice.repositories.UserRepository;

@Configuration
public class InitialUsers {

	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserRepository userRepository;
	
	@Bean
	public void saveInitialUsers () {
		User user = new User();
		user.setId(1);
		user.setUsername("user");
		user.setPassword(passwordEncoder.encode("password"));
		user.setActive(true);
		user.setRoles("ROLE_USER");
		
		User admin = new User();
		admin.setId(2);
		admin.setUsername("admin");
		admin.setPassword(passwordEncoder.encode("password"));
		admin.setActive(true);
		admin.setRoles("ROLE_ADMIN");
		
		userRepository.save(user);
		userRepository.save(admin);
	}
	
}
