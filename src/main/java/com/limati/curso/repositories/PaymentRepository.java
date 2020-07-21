package com.limati.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limati.curso.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
