package com.deveficiente.heuristicas.coesaobasica.treinamentoseatividades.v1;

import java.util.ArrayList;
import java.util.List;

public class Treinamento {

	private String titulo;
	private List<String> titulosAtividades = new ArrayList<>();

	public Treinamento(String titulo) {
		super();
		this.titulo = titulo;
	}

	public static void main(String[] args) {
		Treinamento testeDeFogo = new Treinamento("teste de fogo para você");
		
		/*
		 * Primeiro passo é vocé implementar a adição de titulos de atividades
		 * dentro do treinamento. Como você faria? 
		 */

		/*
		 * Uma vez que você implementou a adição de titulos de atividades,
		 * é necessário que você possibilite a descoberta da posicao do titulo
		 * da atividade dentro do treinamento. 
		 */
	}
}
