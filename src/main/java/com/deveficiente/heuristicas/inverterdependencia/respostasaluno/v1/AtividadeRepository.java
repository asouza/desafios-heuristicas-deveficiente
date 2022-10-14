package com.deveficiente.heuristicas.inverterdependencia.respostasaluno.v1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AtividadeRepository implements CrudRepository<Atividade, Long>,AtividadesRespondidas{
	
	private List<Atividade> atividades = new ArrayList<>();

	@Override
	public Optional<Atividade> ultimaAtividadeRespondida(Aluno aluno,SecaoAtividades secaoAtividades) {
		LinkedList<Atividade> respondidasPeloAluno = atividades
			.stream()
			.filter(atividade -> atividade.foiRespondidaPeloAluno(aluno))
			.collect(Collectors.toCollection(() -> new LinkedList<>()));
		
		return respondidasPeloAluno.isEmpty() ? Optional.empty() : Optional.of(respondidasPeloAluno.getLast());
				
	}

	@Override
	public <S extends Atividade> S save(S entity) {
		this.atividades.add(entity);
		return entity;
	}

	@Override
	public <S extends Atividade> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Atividade> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Atividade> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Atividade> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Atividade entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Atividade> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}



}
