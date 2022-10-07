package com.deveficiente.heuristicas.coesaobasica.datas.v1;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificaDiasParaPartidaController {

	private ViagemRepository viagemRepository;

	public VerificaDiasParaPartidaController(
			ViagemRepository viagemRepository) {
		super();
		this.viagemRepository = viagemRepository;
	}

	@GetMapping("viagens/{id}/dias-para-partir")
	public int executa(@PathVariable("id") Long id) {
		ViagemV1 viagem = viagemRepository.buscaViagem(id);

		/*
		 *  Aqui o código executou um lógica sobre o estado de um objeto
		 *  fora dele. O simples fato de fazer te exigiria maior esforço
		 *  para coisas básicas. 
		 *  
		 *  1) E se eu precisar dessa lógica em outro lugar?
		 *  2) E se eu quiser trocar o tipo que guardo a data da viagem?
		 *  3) E se eu quiser testar essa lógica, o quão fácil fica?
		 *  
		 *  Você poderia ganhar tudo o que está aí em cima usando uma ideia
		 *  básica de OO. Deixar estado perto do comportamento. 
		 */
		return LocalDate.now().until(viagem.getPartida()).getDays();
	}

	public static void main(String[] args) {
		System.out.println(
				new VerificaDiasParaPartidaController(new ViagemRepository())
						.executa(10l));
	}

}
