package com.limati.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.limati.curso.entities.Order;
import com.limati.curso.repositories.OrderRepository;
@Service
public class OrderService {

	@Autowired	
	private OrderRepository repository;
	
	public List<Order> findAll(){
		List<Order> list = repository.findAll();
		return list;
	}
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
