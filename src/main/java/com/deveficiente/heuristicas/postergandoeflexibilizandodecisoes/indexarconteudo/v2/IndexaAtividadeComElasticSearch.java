package com.deveficiente.heuristicas.postergandoeflexibilizandodecisoes.indexarconteudo.v2;

public class IndexaAtividadeComElasticSearch implements IndexadorAtividade{

	@Override
	public void indexa(Atividade atividade) {
		System.out.println("Transformando atividade para o formato necessário...");
		System.out.println("Indexando usando a API do elastic search");
	}

}
