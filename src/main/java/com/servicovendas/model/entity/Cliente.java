package com.servicovendas.model.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 150)
	@NotEmpty(message="O campo nome é obrigatório")
	private String nome;
	
	@Column(nullable = false, length = 15)
	@NotEmpty(message = "O campo CPF é obrigatório")
	@CPF(message="CPF inválido")
	private String cpf;
	
	@Column(name="data_cadastro", updatable = false)
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dataCadastro;
	
	@PrePersist
	public void prepersist() {
		setDataCadastro(LocalDate.now());
	}
		
}
