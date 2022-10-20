package com.deveficiente.heuristicas.templatesefuncoes.transacoes.v2;

import javax.transaction.Transactional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RecebeRespostaExercicioController {

	private RespostaRepository respostaRepository;
	private ExercicioRepository exercicioRepository;
	private IntegracaoTypeForm integracaoTypeForm;
	private ExecutaComTransacao executaComTransacao;

	public RecebeRespostaExercicioController(
			RespostaRepository respostaRepository,
			ExercicioRepository exercicioRepository,
			IntegracaoTypeForm integracaoTypeForm,ExecutaComTransacao executaComTransacao) {
		super();
		this.respostaRepository = respostaRepository;
		this.exercicioRepository = exercicioRepository;
		this.integracaoTypeForm = integracaoTypeForm;
		this.executaComTransacao = executaComTransacao;
	}

	@PostMapping("/recebe-resposta/v1")
	public ResponseEntity<?> executa(Aluno alunoLogado,
			NovaRespostaRequest request) {

		if (integracaoTypeForm.verificaExistencia(request.idExercicio,
				alunoLogado.getEmail())) {
			Resposta novaResposta = request.toResposta(exercicioRepository);
			return executaComTransacao.comRetorno(() -> {
				System.out.println("Salvando a resposta e definindo retorno");
				respostaRepository.salva(novaResposta);
				return ResponseEntity.ok("Resposta salva");				
			});
		}

		return ResponseEntity.notFound().build();
	}

	public static void main(String[] args) {

		RespostaRepository respostaRepository = new RespostaRepository();
		ExercicioRepository exercicioRepository = new ExercicioRepository();
		IntegracaoTypeForm integracaoTypeForm = new IntegracaoTypeForm();
		ExecutaComTransacao executaComTransacao = new ExecutaComTransacao();

		
		RecebeRespostaExercicioController controller = new RecebeRespostaExercicioController(respostaRepository,
				exercicioRepository, integracaoTypeForm,executaComTransacao);
		
		Aluno alunoLogado = new Aluno("teste@deveficiente.com");
		NovaRespostaRequest request = new NovaRespostaRequest(1l,
				"texto da resposta");
		
		ResponseEntity<?> response = controller.executa(alunoLogado, request);
		System.out.println(response.getStatusCodeValue());
	}
}
