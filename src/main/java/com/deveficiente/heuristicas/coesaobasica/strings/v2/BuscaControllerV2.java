package com.deveficiente.heuristicas.coesaobasica.strings.v2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuscaControllerV2 {

	
	@GetMapping("/busca")
	public void executa(BuscaRequestV2 request) {
		
		/**
		 * Aqui temos dois problemas, inclusive um deles vamos endereçar de novo mais para frente.
		 * 
		 * 1) Como você sabe que a string pode ser nula se o retorno é String?
		 * 2) Como você sabe que ela pode ser em branco?
		 * 
		 * O problema é o mesmo, a lógica está saindo de perto do estado
		 * afetando a coesão. Falta de coesão gera falta de confiança e exagero
		 * em checagens. 
		 */
		
		request.getNome().ifPresent(nome -> {
			//faz algo aqui
		});
		
		request.getEndereco().ifPresent(nome -> {
			//faz algo aqui
		});
	}
}
