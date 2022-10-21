package com.deveficiente.heuristicas.enumsricas.status.v1;

import java.util.ArrayList;
import java.util.List;

public class Treinamento {

	private String titulo;
	private List<Atividade> atividades = new ArrayList<>();

	public Treinamento(String titulo, List<Atividade> atividades) {
		super();
		this.titulo = titulo;
		this.atividades = atividades;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Treinamento other = (Treinamento) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	public boolean estaTodoRespondido(List<Resposta> respostas) {
		return this.atividades.stream().allMatch(atividade -> {
			return respostas.stream().anyMatch(
					resposta -> resposta.pertenceAAtividade(atividade));
		});
	}

}
