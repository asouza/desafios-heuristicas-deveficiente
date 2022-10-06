package com.deveficiente.heuristicas.valueobjects.senhaencodada.v1;

import org.springframework.stereotype.Component;

@Component
public class UsuarioRepository {


	public UsuarioV1 busca(Long id) {
		return new UsuarioV1("9u42387423");
	}
}
