package com.deveficiente.heuristicas.coesaobasica.validarequest.v2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;

public class BancoDeDadosPaisesEEstados {

	private Map<String, Pais> paises = new HashMap<>();
	private Map<String, Estado> estados = new HashMap<>();

	{
		Pais brasil = new Pais("Brasil");
		this.paises.put("brasil",brasil);
		Pais eua = new Pais("estados unidos");
		this.paises.put("Estados Unidos",eua);
		
		this.estados.put("bahia", new Estado("Bahia", brasil));
		this.estados.put("california", new Estado("California", eua));
	}
	
	public Pais buscaPaisPeloNome(String nome) {
		Pais pais = paises.get(nome.toLowerCase());
		Assert.notNull(pais,"Não existe um país cadastrado com nome ["+nome+"] ");
		return pais;
	}
	
	public Estado buscaEstadoPeloNome(String nome) {
		Estado estado = estados.get(nome.toLowerCase());
		Assert.notNull(estado,"Não existe um estado cadastrado com nome ["+nome+"] ");
		return estado;
	}
}
