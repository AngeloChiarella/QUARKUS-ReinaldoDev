package com.microservico.angelo.estoquepreco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservico.angelo.estoquepreco.constantes.RabbitMQConstantes;
import com.microservico.angelo.estoquepreco.dto.EstoqueDto;
import com.microservico.angelo.estoquepreco.service.RabbitMQService;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

	@Autowired
	private RabbitMQService service;

	@PutMapping
	private ResponseEntity<?> alteraEstoque(@RequestBody EstoqueDto estoqueDto) {
		this.service.enviaMensagem(RabbitMQConstantes.FILA_ESTOQUE, estoqueDto);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
