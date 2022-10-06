package com.deveficiente.heuristicas.valueobjects.percentual.v2;

import java.math.RoundingMode;

public class ExibePercentualTreinamentoV2 {

	public static void main(String[] args) {
		TreinamentoV2 treinamentoV1 = new TreinamentoV2(10);
		
		/*
		 * Como você sabe o numero de casas decimais aqui? Qual 
		 * foi o arrendondamento?
		 * 
		 * Como você pode refatorar para que o retorno possa ser utilizado
		 * de tal maneira que a pessoa não precise olhar a implementação? 
		 */
		Percentual percentualFeito = treinamentoV1.percentualFeito("email@email.com");
		
		System.out.println(percentualFeito.calcula(2, RoundingMode.HALF_EVEN));
	}
}
