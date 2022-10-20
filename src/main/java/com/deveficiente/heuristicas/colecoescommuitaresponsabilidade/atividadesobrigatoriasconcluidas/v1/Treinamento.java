package com.deveficiente.heuristicas.colecoescommuitaresponsabilidade.atividadesobrigatoriasconcluidas.v1;

import java.math.BigDecimal;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treinamento {

	private String titulo;
	private SortedSet<SecaoAtividades> secoes = new TreeSet<>();

	public Treinamento(String titulo, List<SecaoAtividades> secoes) {
		super();
		this.titulo = titulo;
		secoes.forEach(this.secoes :: add);
	}
	
	public int calculaQuantidadeAtividadesObrigatorias() {
		return 0;
	}
	
	public int calculaQuantasObrigatoriasForamFinalizadas(Aluno aluno) {
		return 0;
	}
	
	public BigDecimal calculaPercentualDeAtividadesObrigatorias() {
		return BigDecimal.ZERO;
	}
	
	

}
