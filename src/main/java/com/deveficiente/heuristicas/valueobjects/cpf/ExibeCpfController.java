package com.deveficiente.heuristicas.valueobjects.cpf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExibeCpfController {
	
	private ClienteRepository clienteRepository;
	
	
	public ExibeCpfController(ClienteRepository clienteRepository) {
		super();
		this.clienteRepository = clienteRepository;
	}



	@GetMapping("/cpf")
	public String executa(Long idCliente) {
		
		Cliente cliente = clienteRepository.busca(idCliente);
		/*
		 * Como você sabe se o cpf está na formataçÃo que você precisa aqui?	
		 */
		return cliente.getCpf();
	}
	
}
