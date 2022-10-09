package com.deveficiente.heuristicas.postergandoeflexibilizandodecisoes.v1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecebeRespostaExercicioController {

	private RespostaRepository respostaRepository;
	private ExercicioRepository exercicioRepository;

	public RecebeRespostaExercicioController(
			RespostaRepository respostaRepository,
			ExercicioRepository exercicioRepository) {
		super();
		this.respostaRepository = respostaRepository;
		this.exercicioRepository = exercicioRepository;
	}

	@PostMapping("/recebe-resposta/v1")
	public void executa(NovaRespostaRequest request) {

		Resposta novaResposta = request.toResposta(exercicioRepository);
		respostaRepository.salva(novaResposta);
		
		/*
		 * Agora é necessário mandar essa nova resposta para uma fila. 
		 * Posteriormente essa resposta vai ser analisada por um modelo de
		 * aprendizado de máquina que vai tentar aplicar uma correção 
		 * automágica para a resposta. 
		 * 
		 * Neste momento queremos usar o SQS da amazon, mas essa não é 
		 * uma decisão que temos certeza se queremos manter no futuro. Você 
		 * precisa resolver aqui esse fluxo fazendo com que seu código expresse
		 * a mesma preocupação que foi relatada neste texto. 
		 * 
		 */

	}
}
