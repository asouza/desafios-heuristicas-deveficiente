package com.deveficiente.heuristicas.postergandoeflexibilizandodecisoes.v2;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class AmazonSQS {

	public void send(Map<String, Object> props) {
		System.out.println("Enviando as informacoes "+props);
	}
}
