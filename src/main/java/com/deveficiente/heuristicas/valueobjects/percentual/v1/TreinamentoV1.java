package com.deveficiente.heuristicas.valueobjects.percentual.v1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class TreinamentoV1 {

	private int numeroDeAulas;
	private Map<String, Integer> aulasFeitasPorAluno = new HashMap<>();

	public TreinamentoV1(int numeroDeAulas) {
		this.numeroDeAulas = numeroDeAulas;
	}

	public BigDecimal percentualFeito(String emailAluno) {
		// aqui é só para simular
		return new BigDecimal(numeroDeAulas / 2).divide(
				new BigDecimal(numeroDeAulas), 3, RoundingMode.HALF_EVEN);
	}

}
