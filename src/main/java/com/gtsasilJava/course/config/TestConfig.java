package com.gtsasilJava.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gtsasilJava.course.entities.User;
import com.gtsasilJava.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	 private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null,"Maria Brow", "maria@email.com", "98888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@emial.com", "9777777","123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
