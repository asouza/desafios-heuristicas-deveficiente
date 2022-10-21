package com.deveficiente.heuristicas.enumsricas.status.v1;

import java.util.ArrayList;
import java.util.List;

public class Inscricao {

	private Treinamento treinamento;
	private Aluno aluno;
	private List<Resposta> respostas = new ArrayList<>();

	public Inscricao(Aluno aluno, Treinamento treinamento) {
		super();
		this.aluno = aluno;
		this.treinamento = treinamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result
				+ ((treinamento == null) ? 0 : treinamento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inscricao other = (Inscricao) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (treinamento == null) {
			if (other.treinamento != null)
				return false;
		} else if (!treinamento.equals(other.treinamento))
			return false;
		return true;
	}

	public StatusProgresso calculaProgresso() {
		/*
		 * Existem 3 possibilidades de progresso:
		 * 
		 * 1) Não começou 2) Começou 3) Finalizou
		 * 
		 * Só que esses status podem evoluir com o tempo. Pode ser que no futuro
		 * seja importante saber quem passou da metade.
		 * 
		 * Como você vai resolver isso aqui?
		 */

		return StatusProgresso.NAO_INICIADO;
	}

	public static void main(String[] args) {
		Atividade atividade1 = new Atividade("atividade 1");
		Atividade atividade2 = new Atividade("atividade 2");
		Atividade atividade3 = new Atividade("atividade 3");

		Treinamento treinamento = new Treinamento("titulo",
				List.of(atividade1, atividade2, atividade3));
		
		Aluno aluno = new Aluno("pessoa@deveficiente.com");

		Inscricao inscricao = new Inscricao(aluno,treinamento);
		
		//faça o código para adicionar uma resposta numa inscricao

		System.out.println(inscricao.calculaProgresso());
	}

}
