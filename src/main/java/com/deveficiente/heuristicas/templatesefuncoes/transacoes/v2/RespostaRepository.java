package com.deveficiente.heuristicas.templatesefuncoes.transacoes.v2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
class RespostaRepository {
	
	private List<Resposta> respostas = new ArrayList<>();

	public void salva(Resposta resposta) {
		respostas.add(resposta);
	}

}
