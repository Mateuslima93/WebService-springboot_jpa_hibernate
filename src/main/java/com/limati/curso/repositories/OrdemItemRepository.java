package com.limati.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limati.curso.entities.OrderItem;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {

}
