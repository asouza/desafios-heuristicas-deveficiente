package com.deveficiente.heuristicas.valueobjects.senhaencodada.v2;

import org.springframework.util.Assert;

public class Senha {

	private String senha;
	private boolean encodada;

	private Senha(String senha,boolean encodada) {
		super();
		this.senha = senha;
		this.encodada = encodada;
	}
	
	public static Senha criaAPartirDeUmaSenhaLimpa(String senha) {
		return new Senha(senha, false);
	}
	
	public static Senha criaAPartirDeUmaSenhaEncodada(String senha) {
		return new Senha(senha,true);
	}
	
	public String getEncodada() {
		if(encodada) {
			return this.senha;
		}
		//aqui podia ser usado qualquer algoritmo que fizesse sentido. 
		return senha.concat("7498643");
	}
	
	public String getSenhaLimpa() {
		Assert.isTrue(!encodada,"Se a senha está encodada não da para voltar... ");
		
		return senha;
	}

}
