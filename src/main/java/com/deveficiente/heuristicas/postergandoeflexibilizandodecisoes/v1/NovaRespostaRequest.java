package com.deveficiente.heuristicas.postergandoeflexibilizandodecisoes.v1;

public class NovaRespostaRequest {

	public final Long idExercicio;
	public final String texto;

	public NovaRespostaRequest(Long idExercicio, String texto) {
		super();
		this.idExercicio = idExercicio;
		this.texto = texto;
	}

	public Resposta toResposta(ExercicioRepository exercicioRepository) {
		
		Exercicio exercicio = exercicioRepository.buscaPorId(idExercicio);
		return new Resposta(exercicio,texto);
	}

}
