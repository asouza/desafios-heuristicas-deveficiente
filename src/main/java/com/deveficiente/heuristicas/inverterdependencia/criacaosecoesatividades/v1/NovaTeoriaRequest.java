package com.deveficiente.heuristicas.inverterdependencia.criacaosecoesatividades.v1;

public class NovaTeoriaRequest implements ProdutorNovaTeoria {

	private final String texto;
	private final int ordem;

	public NovaTeoriaRequest(String texto, int ordem) {
		super();
		this.texto = texto;
		this.ordem = ordem;
	}

	public Teoria toTeoria(SecaoAtividades secaoAtividades) {
		return new Teoria(texto,ordem,secaoAtividades);
	}

}
