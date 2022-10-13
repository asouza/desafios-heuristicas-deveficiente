package com.deveficiente.heuristicas.inverterdependencia.criacaosecoesatividades.v1;

public class Teoria implements Comparable<Teoria>{

	private String texto;
	private int ordem;
	private SecaoAtividades secaoAtividades;

	public Teoria(String texto, int ordem, SecaoAtividades secaoAtividades) {
		this.texto = texto;
		this.ordem = ordem;
		this.secaoAtividades = secaoAtividades;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Teoria other = (Teoria) obj;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		return true;
	}

	@Override
	public int compareTo(Teoria outraTeoria) {
		return this.ordem - outraTeoria.ordem;
	}
	
	

	
}
