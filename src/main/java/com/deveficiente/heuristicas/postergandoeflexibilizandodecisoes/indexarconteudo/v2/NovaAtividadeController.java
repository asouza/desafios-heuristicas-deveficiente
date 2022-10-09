package com.deveficiente.heuristicas.postergandoeflexibilizandodecisoes.indexarconteudo.v2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovaAtividadeController {

	private AtividadeRepository atividadeRepository;
	private IndexadorAtividade indexadorAtividade;

	public NovaAtividadeController(AtividadeRepository atividadeRepository,
			IndexadorAtividade indexadorAtividade) {
		super();
		this.atividadeRepository = atividadeRepository;
		this.indexadorAtividade = indexadorAtividade;
	}

	@PostMapping("nova-atividade/v1")
	public void executa(NovaAtividadeRequest request) {
		Atividade novaAtividade = request.toAtividade();
		atividadeRepository.salva(novaAtividade);

		/*
		 * Agora é necessário pegar essa atividade e indexar em um local que
		 * facilite a busca. Nesse momento estamos entre o postgre search,
		 * lucene direto ou elastic search. Não dominamos muito nenhum e existe
		 * uma boa opção de escolhermos algo e mudarmos de opinião.
		 * 
		 * Como expressar isso no código?
		 */
		
		indexadorAtividade.indexa(novaAtividade);
	}
}
