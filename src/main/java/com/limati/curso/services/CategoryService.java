package com.limati.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.limati.curso.entities.Category;
import com.limati.curso.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		List<Category> list = repository.findAll();
		return list;
	}
	
	public Category finById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
