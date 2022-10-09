package com.deveficiente.heuristicas.postergandoeflexibilizandodecisoes.indexarconteudo.v1;

public class NovaAtividadeRequest {

	private String texto;

	public NovaAtividadeRequest(String texto) {
		super();
		this.texto = texto;
	}

	public Atividade toAtividade() {
		return new Atividade(texto);
	}

}
