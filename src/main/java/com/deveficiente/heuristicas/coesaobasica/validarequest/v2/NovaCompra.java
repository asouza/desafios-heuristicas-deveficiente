package com.deveficiente.heuristicas.coesaobasica.validarequest.v2;

import org.springframework.util.Assert;

public class NovaCompra {

	private Pais pais;
	private Estado estado;

	public NovaCompra(Pais pais) {
		super();
		this.pais = pais;
	}
	
	public void setEstado(Estado estado) {
		Assert.isTrue(estado.pertenceAPais(this.pais),"Não deveria existir uma chamada de setEstado com um estado que não pertence ao país definido");
		this.estado = estado;
	}

}
