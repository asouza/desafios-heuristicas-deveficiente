package com.deveficiente.heuristicas.valueobjects.percentual.v2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class TreinamentoV2 {

	private int numeroDeAulas;
	private Map<String, Integer> aulasFeitasPorAluno = new HashMap<>();

	public TreinamentoV2(int numeroDeAulas) {
		this.numeroDeAulas = numeroDeAulas;
	}

	public Percentual percentualFeito(String emailAluno) {
		return new Percentual(numeroDeAulas/2,numeroDeAulas);
	}

}
