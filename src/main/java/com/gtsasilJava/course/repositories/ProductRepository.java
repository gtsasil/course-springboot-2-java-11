package com.gtsasilJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtsasilJava.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
