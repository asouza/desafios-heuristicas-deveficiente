
package com.deveficiente.heuristicas.valueobjects.senhaencodada.v2;

public class UsuarioV2 {

	private String senha;

	public UsuarioV2(Senha senha) {
		super();
		this.senha = senha.getEncodada();
	}
	
	public Senha getSenha() {
		return Senha.criaAPartirDeUmaSenhaEncodada(senha);
	}
		
	
}
