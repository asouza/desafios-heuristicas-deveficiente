package com.deveficiente.heuristicas.enumsricas.tipoatividade.v1;

public enum TipoAtividade {

	CONVENCIONAL(true),IMITACAO(false),EXEMPLO_TRABALHADO(false);

	private boolean obrigatoria;

	TipoAtividade(boolean obrigatoria) {
		this.obrigatoria = obrigatoria;
	}

	boolean isObrigatoria() {
		return obrigatoria;
	}
}
