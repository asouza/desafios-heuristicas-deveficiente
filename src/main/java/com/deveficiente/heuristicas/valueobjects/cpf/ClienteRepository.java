package com.deveficiente.heuristicas.valueobjects.cpf;

import org.springframework.stereotype.Component;

@Component
public class ClienteRepository {


	public Cliente busca(Long id) {
		return new Cliente("985746985643");
	}
}
