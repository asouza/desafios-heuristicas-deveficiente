package com.deveficiente.heuristicas.coesaobasica.treinamentoseatividades.v2;

public class PosicaoAtividade {

	private int indiceOriginal;
	
	public PosicaoAtividade(int indiceOriginal) {
		super();
		this.indiceOriginal = indiceOriginal;
	}

	public int aPartirDeDeterminadoIndice(int indiceInicialNecessario) {
		return this.indiceOriginal + indiceInicialNecessario;
	}
	
	
	
}
