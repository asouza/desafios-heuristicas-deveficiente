package com.deveficiente.heuristicas.enumsricas.tipoatividade.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treinamento {

	private String titulo;
	private SortedSet<SecaoAtividades> secoes = new TreeSet<>();

	public Treinamento(String titulo, List<SecaoAtividades> secoes) {
		super();
		this.titulo = titulo;
		secoes.forEach(this.secoes :: add);
	}
	
	public int calculaQuantidadeAtividadesObrigatorias() {
		return 0;
	}
	
	public int calculaQuantasObrigatoriasForamFinalizadas(Aluno aluno) {
		return 0;
	}
	
	public int calculaQuantidadeAtividadesNaoObrigatorias() {
		return 0;
	}
	
	public BigDecimal calculaPercentualDeAtividadesObrigatorias() {
		return BigDecimal.ZERO;
	}
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("aluno1@email.com");
		Aluno aluno2 = new Aluno("aluno2@email.com");
		AtividadeRepository atividadeRepository = new AtividadeRepository();
		
		List<Atividade> atividades = new ArrayList<>();
		Atividade atividade1 = new Atividade("t1", 0,TipoAtividade.EXEMPLO_TRABALHADO);
		atividadeRepository.save(atividade1);
		atividades.add(atividade1);
		atividade1.adicionaResposta(new Resposta(atividade1, aluno1));
		atividade1.adicionaResposta(new Resposta(atividade1, aluno2));
		
		Atividade atividade2 = new Atividade("t2", 1,TipoAtividade.IMITACAO);
		atividadeRepository.save(atividade2);
		atividade2.adicionaResposta(new Resposta(atividade2, aluno1));
		atividades.add(atividade2);
		
		
		Atividade atividade3 = new Atividade("t3", 2,TipoAtividade.CONVENCIONAL);
		atividadeRepository.save(atividade3);
		atividades.add(atividade3);
		
		
		SecaoAtividades secaoAtividades = new SecaoAtividades("titulo",1,atividades);
		
		new Treinamento("titulo do treinamento", List.of(secaoAtividades));
		
	}	
	
	

}
