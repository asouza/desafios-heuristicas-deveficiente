package com.deveficiente.heuristicas.inverterdependencia.respostasaluno.v1;

import java.util.List;
import java.util.Optional;
import java.util.SortedSet;
import java.util.TreeSet;

public class SecaoAtividades {

	private String titulo;
	private SortedSet<Atividade> atividades = new TreeSet<>();

	public SecaoAtividades(String titulo, List<Atividade> novasAtividades) {
		super();
		this.titulo = titulo;
		novasAtividades.stream().forEach(this.atividades :: add);
	}
	
	public Optional<Atividade> proximaAtividadeASerRespondidaPeloAluno(Aluno aluno){
		/*
		 * Aqui você tem um potencial problema... Pode ser que tenha milhares de pessoas
		 * alunas e que elas respondam um monte de atividade. Como fazer esse código de modo
		 * a já ficar preparado para funcionar num tempo aceitável?
		 * 
		 * Lembrando que nós temos a classe RespostaRepository que faz as vias
		 * de repositório das respostas.
		 */
		return Optional.empty();
	}

}
