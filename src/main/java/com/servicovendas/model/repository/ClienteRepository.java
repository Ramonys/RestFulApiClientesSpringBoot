package com.servicovendas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicovendas.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
