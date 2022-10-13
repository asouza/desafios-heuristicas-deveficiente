package com.deveficiente.heuristicas.templatesefuncoes.execucaoassincrona.v1;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class ExecutaAsync {

	@Async
	public void semRetorno(Runnable funcao) {
		System.out.println("Executando de maneira async");
		funcao.run();
	}
}
