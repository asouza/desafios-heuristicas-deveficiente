package com.deveficiente.heuristicas.templatesefuncoes.transacoes.v1;

import javax.transaction.Transactional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RecebeRespostaExercicioController {

	private RespostaRepository respostaRepository;
	private ExercicioRepository exercicioRepository;
	private IntegracaoTypeForm integracaoTypeForm;

	public RecebeRespostaExercicioController(
			RespostaRepository respostaRepository,
			ExercicioRepository exercicioRepository,
			IntegracaoTypeForm integracaoTypeForm) {
		super();
		this.respostaRepository = respostaRepository;
		this.exercicioRepository = exercicioRepository;
		this.integracaoTypeForm = integracaoTypeForm;
	}

	@PostMapping("/recebe-resposta/v1")
	@Transactional
	public ResponseEntity<?> executa(Aluno alunoLogado,
			NovaRespostaRequest request) {

		/*
		 * Aqui tem uma chamada remota e estamos segurando recurso do
		 * banco de dados sem fazer nada com ele. Como melhorar?
		 */
		if (integracaoTypeForm.verificaExistencia(request.idExercicio,
				alunoLogado.getEmail())) {
			Resposta novaResposta = request.toResposta(exercicioRepository);
			respostaRepository.salva(novaResposta);
			return ResponseEntity.ok("Resposta salva");
		}

		return ResponseEntity.notFound().build();
	}

	public static void main(String[] args) {

		RespostaRepository respostaRepository = new RespostaRepository();
		ExercicioRepository exercicioRepository = new ExercicioRepository();
		IntegracaoTypeForm integracaoTypeForm = new IntegracaoTypeForm();

		
		RecebeRespostaExercicioController controller = new RecebeRespostaExercicioController(respostaRepository,
				exercicioRepository, integracaoTypeForm);
		
		Aluno alunoLogado = new Aluno("teste@deveficiente.com");
		NovaRespostaRequest request = new NovaRespostaRequest(1l,
				"texto da resposta");
		
		ResponseEntity<?> response = controller.executa(alunoLogado, request);
		System.out.println(response.getStatusCodeValue());
	}
}
