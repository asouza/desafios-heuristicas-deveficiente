package com.deveficiente.heuristicas.enumsricas.statusv1;

import java.util.List;

public enum StatusProgresso {

	NAO_INICIADO {
		@Override
		public boolean aceita(Treinamento treinamento,
				List<Resposta> respostas) {
			return respostas.isEmpty();
		}
	},INICIADO {
		@Override
		public boolean aceita(Treinamento treinamento,
				List<Resposta> respostas) {
			return !respostas.isEmpty();
		}
	},FINALIZADO {
		@Override
		public boolean aceita(Treinamento treinamento,
				List<Resposta> respostas) {
			return treinamento.estaCompleto(respostas);
		}
	};
	
	public abstract boolean aceita(Treinamento treinamento,
			List<Resposta> respostas); 

	public static StatusProgresso descobre(Treinamento treinamento,
			List<Resposta> respostas) {
						
		StatusProgresso ultimoDescoberto = null;
		for(StatusProgresso status : StatusProgresso.values()) {
			if(status.aceita(treinamento,respostas)) {
				ultimoDescoberto = status;
			}
		}
		
		
		//aqui tem pegadinha...
		return ultimoDescoberto;
	}
}
