package com.deveficiente.heuristicas.postergandoeflexibilizandodecisoes.v2;

import org.springframework.stereotype.Component;
import org.springframework.test.util.ReflectionTestUtils;

@Component
public class ExercicioRepository {

	public Exercicio buscaPorId(Long idExercicio) {
		Exercicio exercicio = new Exercicio();
		/*
		 * Aqui é apenas para simular um hibernate da vida definindo um 
		 * id no objeto criado a partir de uma linha do banco de dados
		 */
		ReflectionTestUtils.setField(exercicio, "id", idExercicio);
		return exercicio;
	}

}
