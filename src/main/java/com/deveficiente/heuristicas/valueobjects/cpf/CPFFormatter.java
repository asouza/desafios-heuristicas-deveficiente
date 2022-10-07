package com.deveficiente.heuristicas.valueobjects.cpf;

import java.util.regex.Pattern;

/**
 * Classe copiada daqui => https://github.com/caelum/caelum-stella/blob/52aeb0e6da2f5ae4932832e08c4457c96c603429/stella-core/src/main/java/br/com/caelum/stella/format/CPFFormatter.java#L9
 *
 */
public class CPFFormatter {

	private final BaseFormatter base = new BaseFormatter(
			Pattern.compile("(\\d{3})[.](\\d{3})[.](\\d{3})-(\\d{2})"),
			"$1.$2.$3-$4", 
			Pattern.compile("(\\d{3})(\\d{3})(\\d{3})(\\d{2})"),
			"$1$2$3$4");;


	public String format(String value) {
        return base.format(value);
    }
	
	public String unformat(String value) {
        return base.unformat(value);
    }	

}