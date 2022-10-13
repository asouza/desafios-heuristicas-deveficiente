package com.deveficiente.heuristicas.inverterdependencia.criacaosecoesatividades.v1;

import java.util.List;

public class NovaSecaoRequest {

	private final String titulo;
	private final List<NovaTeoriaRequest> teorias;
	private final List<NovaAtividadeRequest> atividades;
	
	public NovaSecaoRequest(String titulo, List<NovaTeoriaRequest> teorias,
			List<NovaAtividadeRequest> atividades) {
		super();
		this.titulo = titulo;
		this.teorias = teorias;
		this.atividades = atividades;
	}

	public SecaoAtividades toSecao() {
		return new SecaoAtividades(titulo,teorias,atividades);
	}
	
	
	
}
