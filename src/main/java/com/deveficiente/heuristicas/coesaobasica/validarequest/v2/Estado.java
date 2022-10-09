package com.deveficiente.heuristicas.coesaobasica.validarequest.v2;

public class Estado {

	private String nome;
	private Pais pais;

	public Estado(String nome, Pais pais) {
		super();
		this.nome = nome;
		this.pais = pais;
	}

	public boolean pertenceAPais(Pais outroPais) {
		//e se eu não soubesse do equals, como faria?
		return this.pais.equals(outroPais);
	}

}
