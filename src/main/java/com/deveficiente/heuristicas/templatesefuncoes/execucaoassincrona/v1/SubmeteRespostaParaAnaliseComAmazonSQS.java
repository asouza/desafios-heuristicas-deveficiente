package com.deveficiente.heuristicas.templatesefuncoes.execucaoassincrona.v1;

import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class SubmeteRespostaParaAnaliseComAmazonSQS implements SubmeteRespostaParaAnalise {

	private AmazonSQS amazonSQS;

	public SubmeteRespostaParaAnaliseComAmazonSQS(AmazonSQS amazonSQS) {
		super();
		this.amazonSQS = amazonSQS;
	}

	@Override
	public void envia(Resposta resposta) {
		amazonSQS.send(Map.of("uuid", resposta.getUuid(), "texto",
				resposta.getTexto()));
	}

}
