package com.microservico.angelo.estoquepreco.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {

	@Autowired
	private RabbitTemplate rabbitTemplate;

//	Metodo que envia mensagem para o RabbitMQ
	public void enviaMensagem(String nomefila, Object mensagem) {
		this.rabbitTemplate.convertAndSend(nomefila, mensagem);
	}

}
