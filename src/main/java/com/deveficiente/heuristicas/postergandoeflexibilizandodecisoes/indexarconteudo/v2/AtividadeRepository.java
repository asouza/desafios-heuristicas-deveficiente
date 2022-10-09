package com.deveficiente.heuristicas.postergandoeflexibilizandodecisoes.indexarconteudo.v2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AtividadeRepository {
	
	private List<Atividade> atividades = new ArrayList<>();

	public void salva(Atividade novaAtividade) {
		this.atividades.add(novaAtividade);
	}

}
