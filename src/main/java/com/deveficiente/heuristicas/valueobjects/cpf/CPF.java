package com.deveficiente.heuristicas.valueobjects.cpf;

public class CPF {

	private String cpfSemFormatacao;
	private String cpfComFormatacao;
	private CPFFormatter formatador = new CPFFormatter();


	private CPF(String cpf, boolean formatado) {
		if(formatado) {
			this.cpfSemFormatacao = formatador.unformat(cpf);
			this.cpfComFormatacao = cpf;
		} else {
			this.cpfSemFormatacao = cpf;
			this.cpfComFormatacao = formatador.format(cpf);			
		}
	}

	public static CPF criaSemFormatacao(String cpf) {
		return new CPF(cpf, false);
	}
	
	public static CPF criaComFormatacao(String cpf) {
		return new CPF(cpf, true);
	}
	
	public String getCpfSemFormatacao() {
		return cpfSemFormatacao;
	}
	
	public String getCpfComFormatacao() {
		return cpfComFormatacao;
	}

}
