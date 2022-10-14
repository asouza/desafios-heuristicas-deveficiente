package com.deveficiente.heuristicas.inverterdependencia.respostasaluno.v1;

import java.util.Optional;

public interface AtividadesRespondidas {

	public Optional<Atividade> ultimaAtividadeRespondida(Aluno aluno,SecaoAtividades secaoAtividades);
}
