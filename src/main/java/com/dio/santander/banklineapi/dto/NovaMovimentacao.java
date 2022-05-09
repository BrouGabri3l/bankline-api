package com.dio.santander.banklineapi.dto;

import com.dio.santander.banklineapi.model.MovimentacaoTipo;

public class NovaMovimentacao {
	private Double valor;
	
	private String Descricao;
	
	private MovimentacaoTipo Tipo;
	
	private Integer IdConta;

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public MovimentacaoTipo getTipo() {
		return Tipo;
	}

	public void setTipo(MovimentacaoTipo tipo) {
		Tipo = tipo;
	}

	public Integer getIdConta() {
		return IdConta;
	}

	public void setIdConta(Integer idConta) {
		IdConta = idConta;
	}
	
}
