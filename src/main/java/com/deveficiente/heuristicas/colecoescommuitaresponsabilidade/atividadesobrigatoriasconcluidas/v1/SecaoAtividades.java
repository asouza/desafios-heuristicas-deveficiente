package com.deveficiente.heuristicas.colecoescommuitaresponsabilidade.atividadesobrigatoriasconcluidas.v1;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SecaoAtividades implements Comparable<SecaoAtividades>{

	private String titulo;
	private SortedSet<Atividade> atividades = new TreeSet<>();
	private int ordem;

	public SecaoAtividades(String titulo,int ordem,List<Atividade> novasAtividades) {
		super();
		this.titulo = titulo;
		this.ordem = ordem;
		novasAtividades.stream().forEach(this.atividades :: add);
	}
	
	@Override
	public int compareTo(SecaoAtividades outra) {
		return this.ordem - outra.ordem;
	}

}
