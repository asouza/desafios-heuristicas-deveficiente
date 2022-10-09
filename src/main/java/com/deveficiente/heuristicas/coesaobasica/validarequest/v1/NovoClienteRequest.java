package com.deveficiente.heuristicas.coesaobasica.validarequest.v1;

public class NovoClienteRequest {

	private String nomePais;
	private String nomeEstado;

	public NovoClienteRequest(String nomePais) {
		//país é obrigatório no cadastro
		super();
		this.nomePais = nomePais;
	}
	
	public void setEstado(String nomeEstado) {
		//estado é opcional
		this.nomeEstado = nomeEstado;
	}
	

}
