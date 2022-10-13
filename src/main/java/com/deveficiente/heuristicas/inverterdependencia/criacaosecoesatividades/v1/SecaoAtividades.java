package com.deveficiente.heuristicas.inverterdependencia.criacaosecoesatividades.v1;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SecaoAtividades {

	private String titulo;
	private SortedSet<Teoria> teorias = new TreeSet<>();
	private SortedSet<Atividade> atividades = new TreeSet<>();

	public SecaoAtividades(String titulo, List<? extends ProdutorNovaTeoria> dadosNovasTeorias,
			List<? extends ProdutorNovaAtividade> dadosNovasAtividades) {
		this.titulo = titulo;
		
		dadosNovasTeorias.stream().forEach(novaTeoria -> {
			teorias.add(novaTeoria.toTeoria(this));
		});
		
		dadosNovasAtividades.stream().forEach(novaAtividade -> {
			atividades.add(novaAtividade.toAtividade(this));
		});
		
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
		SecaoAtividades other = (SecaoAtividades) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	

}
