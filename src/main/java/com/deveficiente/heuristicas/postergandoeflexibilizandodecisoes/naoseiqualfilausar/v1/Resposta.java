package com.deveficiente.heuristicas.postergandoeflexibilizandodecisoes.naoseiqualfilausar.v1;

import java.util.UUID;

public class Resposta {

	/*
	 * Deixando a ideia de id global por aqui
	 */
	private UUID uuid;
	private Exercicio exercicio;
	private String texto;

	public Resposta(Exercicio exercicio, String texto) {
		this.exercicio = exercicio;
		this.texto = texto;
		this.uuid = UUID.randomUUID();
	}
	
	public UUID getUuid() {
		return uuid;
	}
	
	public String getTexto() {
		return texto;
	}

}
