package com.deveficiente.heuristicas.inverterdependencia.criacaosecoesatividades.v1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImportaSecaoViaMarkdownController {

	@PostMapping("/secoes/markdown/v1")
	public void executa() {
		/*
		 * Durante o parse do markdown vamos construindo os dados da nova 
		 * secao. Precisamos de um dto específico, onde vamos acumulando as 
		 * teorias e atividades. A classe desenhada para suportar o parser
		 * tem o seu uso da seguinte forma.  
		 */
		
		NovaSecaoMarkdown novaSecaoMarkdown = new NovaSecaoMarkdown("titulo da secao");
		novaSecaoMarkdown.adicionaTeoria("titulo1",1);
		novaSecaoMarkdown.adicionaAtividade("titulo 1",1,TipoAtividade.OBRIGATORIA);
		
		
	}
}
