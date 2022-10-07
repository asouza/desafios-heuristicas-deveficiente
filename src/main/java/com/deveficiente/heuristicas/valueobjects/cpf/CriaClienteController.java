package com.deveficiente.heuristicas.valueobjects.cpf;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CriaClienteController {

	@PostMapping("/cpf/v1")
	public String executa(String cpf) {
		/*
		 * Como você sabe se é para passar o cpf é com pontuação ou sem? Como você vai 
		 * facilitar a vida de quem vai usar essa classe?	
		 */
		Cliente cliente = new Cliente(CPF.criaSemFormatacao(cpf));
		
		return cliente.getCpf().getCpfSemFormatacao();
	}
	
	public static void main(String[] args) {
		System.out.println(new CriaClienteController().executa("39966279040"));
	}
	
}
