package com.deveficiente.heuristicas.coesaobasica.treinamentoseatividades.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Treinamento {

	private String titulo;
	private List<String> titulosAtividades = new ArrayList<>();

	public Treinamento(String titulo) {
		super();
		this.titulo = titulo;
	}

	public Optional<PosicaoAtividade> posicaoAtividade(String titulo) {
		int posicao = this.titulosAtividades.indexOf(titulo);
		if (posicao > -1) {
			return Optional.of(new PosicaoAtividade(posicao));
		}
		return Optional.empty();
	}

	public void adicionaTituloAtividade(String titulo) {
		this.titulosAtividades.add(titulo);
	}

	public static void main(String[] args) {
		Treinamento testeDeFogo = new Treinamento("teste de fogo para você");

		/*
		 * Primeiro passo é vocé implementar a adição de titulos de atividades
		 * dentro do treinamento. Como você faria?
		 */

		testeDeFogo.adicionaTituloAtividade("Atividade 1");
		testeDeFogo.adicionaTituloAtividade("Atividade 2");
		testeDeFogo.adicionaTituloAtividade("Atividade 3");

		/*
		 * Uma vez que você implementou a adição de titulos de atividades, é
		 * necessário que você possibilite a descoberta da posicao do titulo da
		 * atividade dentro do treinamento.
		 */

		/*
		 * Agora como você sabe que a posicao inicial é zero ou um ?
		 */
		System.out.println(testeDeFogo.posicaoAtividade("Atividade 1")
				.map(posicao -> posicao.aPartirDeDeterminadoIndice(1)));

	}
}
