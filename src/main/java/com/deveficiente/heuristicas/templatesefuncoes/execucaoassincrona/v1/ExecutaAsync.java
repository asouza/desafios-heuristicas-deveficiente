package com.deveficiente.heuristicas.templatesefuncoes.execucaoassincrona.v1;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class ExecutaAsync {

	@Async
	public void semRetorno(Runnable funcao) {
		System.out.println("Executando de maneira async");
		funcao.run();
	}
	
	@Async
	public <T> CompletableFuture<T> comRetono(Supplier<T> funcao){
		return CompletableFuture.completedFuture(funcao.get());
	}
}
