package com.deveficiente.heuristicas.inverterdependencia.respostasaluno.v1;

import java.util.ArrayList;
import java.util.List;

public class Atividade implements Comparable<Atividade> {

	private String titulo;
	private int ordem;
	private List<Resposta> respostas = new ArrayList<>();

	public Atividade(String titulo, int ordem) {
		super();
		this.titulo = titulo;
		this.ordem = ordem;
	}

	public void adicionaResposta(Resposta resposta) {
		this.respostas.add(resposta);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ordem;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Atividade other = (Atividade) obj;
		if (ordem != other.ordem)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public int compareTo(Atividade outra) {
		return this.ordem - outra.ordem;
	}

	@Override
	public String toString() {
		return "Atividade [titulo=" + titulo + ", ordem=" + ordem + "]";
	}

}
