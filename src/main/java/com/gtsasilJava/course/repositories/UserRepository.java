package com.gtsasilJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtsasilJava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
