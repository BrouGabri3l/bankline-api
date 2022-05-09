package com.dio.santander.banklineapi.dto;

import com.dio.santander.banklineapi.model.MovimentacaoTipo;

public class NovaMovimentacao {
	private Double valor;
	
	private String descricao;
	
	private MovimentacaoTipo tipo;
	
	private Integer idConta;

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public MovimentacaoTipo getTipo() {
		return tipo;
	}

	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	
}
