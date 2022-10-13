package com.deveficiente.heuristicas.inverterdependencia.criacaosecoesatividades.v1;

import java.util.ArrayList;
import java.util.List;

public class NovaSecaoMarkdown {

	private String titulo;
	private List<NovaTeoriaMarkdown> novasTeorias = new ArrayList<>();
	private List<NovaAtividadeMarkdown> novasAtividades = new ArrayList<>();

	public NovaSecaoMarkdown(String titulo) {
		this.titulo = titulo;
	}

	public void adicionaTeoria(String tituloTeoria, int ordem) {
		this.novasTeorias.add(new NovaTeoriaMarkdown(tituloTeoria, ordem));
	}

	public void adicionaAtividade(String tituloAtividade, int ordem,
			TipoAtividade tipo) {
		this.novasAtividades.add(new NovaAtividadeMarkdown(tituloAtividade, tipo, ordem));
	}

	public SecaoAtividades toSecao() {
		/*
		 * e agora? Como vamos fazer? No caso do java aqui, ele nem aceita criar
		 * um outro construtor com os mesmos 3 parametros considerando a lista por
		 * conta do jeito que ele implementa os tipos genéricos? 
		 * 
		 * Transformamos?
		 */
		
		return null;
	}

}
