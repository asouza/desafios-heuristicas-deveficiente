package com.deveficiente.heuristicas.enumsricas.status.v1;

public class Resposta {

	private Atividade atividade;
	private Inscricao inscricao;

	public Resposta(Inscricao inscricao, Atividade atividade) {
		super();
		this.inscricao = inscricao;
		this.atividade = atividade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((atividade == null) ? 0 : atividade.hashCode());
		result = prime * result
				+ ((inscricao == null) ? 0 : inscricao.hashCode());
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
		Resposta other = (Resposta) obj;
		if (atividade == null) {
			if (other.atividade != null)
				return false;
		} else if (!atividade.equals(other.atividade))
			return false;
		if (inscricao == null) {
			if (other.inscricao != null)
				return false;
		} else if (!inscricao.equals(other.inscricao))
			return false;
		return true;
	}
	
	

	

}
