package com.limati.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limati.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
