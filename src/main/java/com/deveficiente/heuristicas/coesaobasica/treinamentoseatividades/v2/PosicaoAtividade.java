package com.deveficiente.heuristicas.coesaobasica.treinamentoseatividades.v2;

public class PosicaoAtividade {

	private int indiceOriginal;
	
	public PosicaoAtividade(int indiceOriginal) {
		super();
		this.indiceOriginal = indiceOriginal;
	}

	public int aPartirDeDeterminadoIndice(int indiceInicialNecessario) {
		//E se chegar negativo, vale? Claro que não. 
		return this.indiceOriginal + indiceInicialNecessario;
	}
	
	
	
}
