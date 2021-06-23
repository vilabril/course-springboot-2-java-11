package com.vilabril.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vilabril.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
