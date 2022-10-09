package com.deveficiente.heuristicas.postergandoeflexibilizandodecisoes.naoseiqualfilausar.v2;

import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SubmeteComAmazonSQS implements SubmeteRespostaParaAnalise {

	private AmazonSQS amazonSQS;

	public SubmeteComAmazonSQS(AmazonSQS amazonSQS) {
		super();
		this.amazonSQS = amazonSQS;
	}

	@Override
	public void envia(Resposta resposta) {
		amazonSQS.send(Map.of("uuid", resposta.getUuid(), "texto",
				resposta.getTexto()));
	}

}
