package com.microservico.angelo.estoquepreco.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EstoqueDto implements Serializable {
	private static final long serialVersionUID = 1L;

	public String codigo;
	public Integer quantidade;
	
}
