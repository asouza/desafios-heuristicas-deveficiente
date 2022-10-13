package com.deveficiente.heuristicas.inverterdependencia.criacaosecoesatividades.v1;

public class Atividade implements Comparable<Atividade>{

	private String texto;
	private TipoAtividade tipoAtividade;
	private int ordem;
	private SecaoAtividades secaoAtividades;

	public Atividade(String texto, TipoAtividade tipoAtividade, int ordem,
			SecaoAtividades secaoAtividades) {
				this.texto = texto;
				this.tipoAtividade = tipoAtividade;
				this.ordem = ordem;
				this.secaoAtividades = secaoAtividades;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((secaoAtividades == null) ? 0 : secaoAtividades.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
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
		if (secaoAtividades == null) {
			if (other.secaoAtividades != null)
				return false;
		} else if (!secaoAtividades.equals(other.secaoAtividades))
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		return true;
	}

	@Override
	public int compareTo(Atividade outraAtividade) {
		return this.ordem - outraAtividade.ordem;
	}
	
	

}
