package com.vilabril.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vilabril.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
