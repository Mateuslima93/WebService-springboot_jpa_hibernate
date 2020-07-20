package com.limati.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limati.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
