package com.deveficiente.heuristicas.valueobjects.senhaencodada.v2;

import org.springframework.stereotype.Component;

@Component
public class UsuarioRepository {


	public UsuarioV2 busca(Long id) {
		return new UsuarioV2(Senha.criaAPartirDeUmaSenhaEncodada("123456"));
	}
}
