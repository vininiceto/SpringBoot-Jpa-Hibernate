package com.aprendendospring.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aprendendospring.curso.entities.Category;
import com.aprendendospring.curso.entities.User;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
