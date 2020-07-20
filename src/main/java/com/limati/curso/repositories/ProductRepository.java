package com.limati.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limati.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
