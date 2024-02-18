package com.aprendendospring.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.curso.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
