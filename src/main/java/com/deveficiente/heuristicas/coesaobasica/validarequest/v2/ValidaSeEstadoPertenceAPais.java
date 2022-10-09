package com.deveficiente.heuristicas.coesaobasica.validarequest.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ValidaSeEstadoPertenceAPais {

	/*
	 * Existem dois países cadastrados com os seguintes nomes:
	 * 
	 * 1) Brasil 2) Estados Unidos
	 * 
	 * Existem também dois estados pré cadastrados para cada país
	 * 
	 * 1) Bahia 2) Californina
	 */
	private BancoDeDadosPaisesEEstados bancoDeDadosPaisesEEstados;

	public ValidaSeEstadoPertenceAPais(
			BancoDeDadosPaisesEEstados bancoDeDadosPaisesEEstados) {
		super();
		this.bancoDeDadosPaisesEEstados = bancoDeDadosPaisesEEstados;
	}

	/**
	 * 
	 * @return lista com mensagens de erros
	 */
	public List<String> valida(NovoClienteRequest request) {
		// é necessário agora implementar a seguinte validação:
		/*
		 * A validação é a seguinte: Caso um estado tenha sido selecionado, é
		 * necessário verificar se ele pertence ao pais que foi escolhido.
		 */

		Optional<String> possivelNomeEstado = request.getNomeEstado();
		ArrayList<String> erros = new ArrayList<>();
		if (possivelNomeEstado.isPresent()) {

			Pais paisSelecionado = bancoDeDadosPaisesEEstados
					.buscaPaisPeloNome(request.getNomePais());

			Estado estadoSelecionado = bancoDeDadosPaisesEEstados
					.buscaEstadoPeloNome(possivelNomeEstado.get());

			if (!estadoSelecionado.pertenceAPais(paisSelecionado)) {
				erros.add("O estado selecionado não pertence ao pais");
			}
		}
		return erros;
	}

	public static void main(String[] args) {
		ValidaSeEstadoPertenceAPais validador = new ValidaSeEstadoPertenceAPais(
				new BancoDeDadosPaisesEEstados());
		
		NovoClienteRequest request = new NovoClienteRequest("Brasil");
		request.setEstado("California");
		
		System.out.println(validador.valida(request));
	}
}
