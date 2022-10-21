package com.deveficiente.heuristicas.enumsricas.tipoatividade.v1;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SecaoAtividades implements Comparable<SecaoAtividades> {

	private String titulo;
	private SortedSet<Atividade> atividades = new TreeSet<>();
	private int ordem;

	public SecaoAtividades(String titulo, int ordem,
			List<Atividade> novasAtividades) {
		super();
		this.titulo = titulo;
		this.ordem = ordem;
		novasAtividades.stream().forEach(this.atividades::add);
	}

	@Override
	public int compareTo(SecaoAtividades outra) {
		return this.ordem - outra.ordem;
	}

	public int quantidadeAtividadesObrigatorias() {
		return (int) this.atividades.stream()
				.filter(atividade -> atividade.isObrigatoria())
				.count();
	}

	public List<Resposta> respostasDeterminadoAluno(Aluno aluno) {
		return this.atividades
				.stream()
				.flatMap(atividade -> atividade.respostasDeterminadoAluno(aluno).stream())
				.toList();
	}

	public int totalAtividades() {
		return this.atividades.size();
	}

	public int quantidadeAtividadesNaoObrigatorias() {
		return (int) this.atividades.stream()
				.filter(atividade -> !atividade.isObrigatoria())
				.count();

	}

}
