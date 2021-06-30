package com.vilabril.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vilabril.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
