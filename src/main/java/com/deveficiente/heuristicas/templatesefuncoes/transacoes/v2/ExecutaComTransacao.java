package com.deveficiente.heuristicas.templatesefuncoes.transacoes.v2;

import java.util.function.Supplier;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

@Component
public class ExecutaComTransacao {

	@Transactional
	public <T> T comRetorno(Supplier<T> funcao) {
		System.out.println("Simulando abertura de transacao");
		T retorno = funcao.get();
		System.out.println("Simulando commit da transacao");
		return retorno;

	}
}
