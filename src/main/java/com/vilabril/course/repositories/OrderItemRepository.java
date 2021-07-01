package com.vilabril.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vilabril.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
