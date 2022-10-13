package com.deveficiente.heuristicas.templatesefuncoes.transacoes.v2;

import org.springframework.stereotype.Component;
import org.springframework.test.util.ReflectionTestUtils;

@Component
class ExercicioRepository {

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
