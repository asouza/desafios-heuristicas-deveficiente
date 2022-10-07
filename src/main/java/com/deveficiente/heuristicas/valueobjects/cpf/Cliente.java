package com.deveficiente.heuristicas.valueobjects.cpf;

public class Cliente {

	private String cpf;

	public Cliente(CPF cpf) {
		super();
		this.cpf = cpf.getCpfSemFormatacao();
	}


	public CPF getCpf() {
		return CPF.criaSemFormatacao(cpf);
	}
	
}
