package com.deveficiente.heuristicas.coesaobasica.validarequest.v1;

import java.util.List;

public class ValidaSeEstadoPertenceAPais {
	
	/*
	 * Existem dois países cadastrados com os seguintes nomes:
	 * 
	 * 1) Brasil
	 * 2) Estados Unidos
	 * 
	 * Existem também dois estados pré cadastrados para cada país
	 * 
	 * 1) Bahia 
	 * 2) Californina
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
		//é necessário agora implementar a seguinte validação:
		/*
		 * A validação é a seguinte: Caso um estado tenha sido selecionado, 
		 * é necessário verificar se ele pertence ao pais que foi escolhido. 
		 */
		return null;
	}
}
