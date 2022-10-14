package com.deveficiente.heuristicas.inverterdependencia.respostasaluno.v1;

import java.util.ArrayList;
import java.util.Iterator;
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
		novasAtividades.stream().forEach(this.atividades::add);
	}

	public Optional<Atividade> proximaAtividadeASerRespondidaPeloAluno(
			Aluno aluno,AtividadesRespondidas atividadesRespondidas) {
		/*
		 * Aqui você tem um potencial problema... Pode ser que tenha milhares de
		 * pessoas alunas e que elas respondam um monte de atividade. Preciso
		 * que você leve isso em consideração na implementação deste método.
		 * 
		 * Lembrando que nós temos a classe RespostaRepository que faz as vias
		 * de repositório das respostas.
		 * 
		 * 
		 */

		Optional<Atividade> ultimaAtividadeRespondida = atividadesRespondidas.ultimaAtividadeRespondida(aluno, this);
		
		if(ultimaAtividadeRespondida.isEmpty()) {
			return Optional.of(this.atividades.first());
		}

		return this.atividades
			.stream()
			.filter(atividade -> atividade.posterior(ultimaAtividadeRespondida.get()))
			.findFirst();

	}
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("aluno1@email.com");
		Aluno aluno2 = new Aluno("aluno2@email.com");
		AtividadeRepository atividadeRepository = new AtividadeRepository();
		
		List<Atividade> atividades = new ArrayList<>();
		Atividade atividade1 = new Atividade("t1", 0);
		atividadeRepository.save(atividade1);
		atividades.add(atividade1);
		atividade1.adicionaResposta(new Resposta(atividade1, aluno1));
		atividade1.adicionaResposta(new Resposta(atividade1, aluno2));
		
		Atividade atividade2 = new Atividade("t2", 1);
		atividadeRepository.save(atividade2);
		atividade2.adicionaResposta(new Resposta(atividade2, aluno1));
		atividades.add(atividade2);
		Atividade atividade3 = new Atividade("t3", 2);
		atividadeRepository.save(atividade3);
		atividade3.adicionaResposta(new Resposta(atividade3, aluno1));
		atividades.add(atividade3);
		
		
		SecaoAtividades secaoAtividades = new SecaoAtividades("titulo", atividades);
		Optional<Atividade> proxima = secaoAtividades.proximaAtividadeASerRespondidaPeloAluno(aluno1,atividadeRepository);
		System.out.println(proxima);
	}

}
