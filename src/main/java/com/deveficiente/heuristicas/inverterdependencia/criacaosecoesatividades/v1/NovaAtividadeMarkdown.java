package com.deveficiente.heuristicas.inverterdependencia.criacaosecoesatividades.v1;

public class NovaAtividadeMarkdown implements ProdutorNovaAtividade{

	private final String texto;
	private final TipoAtividade tipoAtividade;
	private final int ordem;

	public NovaAtividadeMarkdown(String texto, TipoAtividade tipoAtividade, int ordem) {
		super();
		this.texto = texto;
		this.tipoAtividade = tipoAtividade;
		this.ordem = ordem;
	}

	public Atividade toAtividade(SecaoAtividades secaoAtividades) {
		return new Atividade(texto,tipoAtividade,ordem,secaoAtividades);
	}

}
