package com.deveficiente.heuristicas.valueobjects.cpf;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CriaClienteController {

	@PostMapping("/cpf/v1")
	public void executa(String cpf) {
		/*
		 * Como você sabe se o cpf é com pontuação ou sem? Como você vai 
		 * facilitar a vida de quem vai usar essa classe?
		 */
		new Cliente(cpf);
	}
	
}
