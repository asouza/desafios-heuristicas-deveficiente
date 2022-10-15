package com.deveficiente.heuristicas.enumsricas.status.v1;

import java.math.BigDecimal;
import java.util.List;

public class Inscricao {

	private Treinamento treinamento;

	public Inscricao(Treinamento treinamento) {
		super();
		this.treinamento = treinamento;
	}

	public StatusProgresso calculaProgresso(List<Resposta> respostas) {
		/*
		 * Existem 4 possibilidades de progresso:
		 * 
		 * 1) Não começou 2) Começou 3) Finalizou
		 * 
		 * Só que esses status podem evoluir com o tempo. Pode ser que no futuro
		 * seja importante saber quem passou da metade.
		 * 
		 * Como você vai resolver isso aqui?
		 */

		return StatusProgresso.NAO_INICIADO;
	}

	public static void main(String[] args) {
		Atividade atividade1 = new Atividade("atividade 1");
		Atividade atividade2 = new Atividade("atividade 2");
		Atividade atividade3 = new Atividade("atividade 3");
		
		Treinamento treinamento = new Treinamento("titulo", List.of(atividade1,
				atividade2, atividade3));
		
		Inscricao inscricao = new Inscricao(treinamento);
		
		/*
		 * Daqui para baixo explore como achar melhor :)
		 */
		Resposta resposta1 = new Resposta(atividade1);
		
		System.out.println(inscricao.calculaProgresso(List.of(resposta1)));
	}

}
