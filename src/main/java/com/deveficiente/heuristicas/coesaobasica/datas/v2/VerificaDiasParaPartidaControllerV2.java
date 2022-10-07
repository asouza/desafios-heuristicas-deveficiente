package com.deveficiente.heuristicas.coesaobasica.datas.v2;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificaDiasParaPartidaControllerV2 {

	private ViagemRepository viagemRepository;

	public VerificaDiasParaPartidaControllerV2(
			ViagemRepository viagemRepository) {
		super();
		this.viagemRepository = viagemRepository;
	}

	@GetMapping("viagens/{id}/dias-para-partir")
	public int executa(@PathVariable("id") Long id) {
		ViagemV2 viagem = viagemRepository.buscaViagem(id);

		/*
		 *  Aqui o código executou um lógica sobre o estado de um objeto
		 *  fora dele. O simples fato de fazer te exigiria maior esforço
		 *  para coisas básicas. 
		 *  
		 *  1) E se eu precisar dessa lógica em outro lugar? -> É só reutilizar a lógica
		 *  2) E se eu quiser trocar o tipo que guardo a data da viagem? -> É só trocar a implementação
		 *  3) E se eu quiser testar essa lógica, o quão fácil fica? -> É só testar a classe Viagem
		 *  
		 *  Você poderia ganhar tudo o que está aí em cima usando uma ideia
		 *  básica de OO. Deixar estado perto do comportamento. 
		 */
		return viagem.quantasDiasFaltam(LocalDate.now());
	}

	public static void main(String[] args) {
		System.out.println(
				new VerificaDiasParaPartidaControllerV2(new ViagemRepository())
						.executa(10l));
	}

}
