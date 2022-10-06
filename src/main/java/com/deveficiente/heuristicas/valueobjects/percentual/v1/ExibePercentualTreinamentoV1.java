package com.deveficiente.heuristicas.valueobjects.percentual.v1;

import java.math.BigDecimal;

public class ExibePercentualTreinamentoV1 {

	public static void main(String[] args) {
		TreinamentoV1 treinamentoV1 = new TreinamentoV1(10);
		
		/*
		 * Como você sabe o numero de casas decimais aqui? Qual 
		 * foi o arrendondamento?
		 * 
		 * Como você pode refatorar para que o retorno possa ser utilizado
		 * de tal maneira que a pessoa não precise olhar a implementação? 
		 */
		BigDecimal percentualFeito = treinamentoV1.percentualFeito("email@email.com");
		
		System.out.println(percentualFeito);
	}
}
