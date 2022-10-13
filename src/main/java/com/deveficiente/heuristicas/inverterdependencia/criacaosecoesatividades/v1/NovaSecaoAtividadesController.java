package com.deveficiente.heuristicas.inverterdependencia.criacaosecoesatividades.v1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovaSecaoAtividadesController {

	
	@PostMapping("/secoes/v1")
	public void executa(NovaSecaoRequest request) {
		request.toSecao();
	}
}
