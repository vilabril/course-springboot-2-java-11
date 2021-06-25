package com.vilabril.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vilabril.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
