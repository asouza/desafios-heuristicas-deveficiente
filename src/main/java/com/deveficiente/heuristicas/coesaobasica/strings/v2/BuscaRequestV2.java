package com.deveficiente.heuristicas.coesaobasica.strings.v2;

import java.util.Optional;

public class BuscaRequestV2 {

	private String nome;
	private String endereco;
	
	public void setNome(String nome) {
		//Deveria aceitar string em branco? Hm.... Vamos voltar nisso mais para frente.
		//como você sabe que não vem branco? O quão flexível você quer ser aqui?
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Optional<String> getNome() {
		return Optional.ofNullable(nome);
	}
	
	public Optional<String> getEndereco() {
		return Optional.ofNullable(endereco);
	}
}
