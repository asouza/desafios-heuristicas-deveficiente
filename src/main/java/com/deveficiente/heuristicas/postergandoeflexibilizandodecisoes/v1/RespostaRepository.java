package com.deveficiente.heuristicas.postergandoeflexibilizandodecisoes.v1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RespostaRepository {
	
	private List<Resposta> respostas = new ArrayList<>();

	public void salva(Resposta resposta) {
		respostas.add(resposta);
	}

}
