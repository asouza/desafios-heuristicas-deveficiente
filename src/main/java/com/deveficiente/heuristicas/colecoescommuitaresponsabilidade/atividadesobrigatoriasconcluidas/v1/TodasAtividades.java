package com.deveficiente.heuristicas.colecoescommuitaresponsabilidade.atividadesobrigatoriasconcluidas.v1;

import java.util.SortedSet;

public class TodasAtividades {

	private SortedSet<SecaoAtividades> secoes;

	public TodasAtividades(SortedSet<SecaoAtividades> secoes) {
		this.secoes = secoes;
	}

	public int quantidadeObrigatorias() {
		return this.secoes.stream().mapToInt(
				secao -> secao.quantidadeAtividadesObrigatorias())
				.sum();
	}

	public int calculaFinalizadasPorAluno(Aluno aluno) {
		return (int) this.secoes.stream().flatMap(
				secao -> secao.respostasDeterminadoAluno(aluno).stream())
				.filter(resposta -> resposta.isObrigatoria())
				.count();
	}

	public int total() {
		return this.secoes.stream()
		.mapToInt(secao -> secao.totalAtividades()).sum();
	}

}
