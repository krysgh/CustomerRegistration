package com.projeto.crud_thymeleaf_springboot.repository;

import com.projeto.crud_thymeleaf_springboot.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}