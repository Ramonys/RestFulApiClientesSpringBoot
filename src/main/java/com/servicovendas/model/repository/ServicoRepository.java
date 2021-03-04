package com.servicovendas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicovendas.model.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}
