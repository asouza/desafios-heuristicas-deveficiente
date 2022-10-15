package com.deveficiente.heuristicas.enumsricas.status.v1;

import java.util.ArrayList;
import java.util.List;

public class Treinamento {

	private String titulo;
	private List<Atividade> atividades = new ArrayList<>();

	public Treinamento(String titulo, List<Atividade> atividades) {
		super();
		this.titulo = titulo;
		this.atividades = atividades;
	}
	
	

}
