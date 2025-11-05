package com.projeto.crud_thymeleaf_springboot.service;

import com.projeto.crud_thymeleaf_springboot.model.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {
    List<Cliente> findAll();
    Cliente save(Cliente cliente);
    Optional<Cliente> findById(Long id);
    void deleteById(Long id);
}