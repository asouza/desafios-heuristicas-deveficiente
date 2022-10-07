package com.deveficiente.heuristicas.valueobjects.cpf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Essa classe foi copiada daqui => https://github.com/caelum/caelum-stella/blob/master/stella-core/src/main/java/br/com/caelum/stella/format/BaseFormatter.java
 *
 */
public class BaseFormatter {

    private final Pattern formatted;

    private final String formattedReplacement;

    private final Pattern unformatted;

    private final String unformattedReplacement;

	public String format(String value) throws IllegalArgumentException {
        String result;
        if (value == null) {
            throw new IllegalArgumentException("Value may not be null.");
        }
        Matcher matcher = unformatted.matcher(value);
        result = matchAndReplace(matcher, formattedReplacement);
        return result;
    }

	public String unformat(String value) throws IllegalArgumentException {
        String result;
        if (value == null) {
            throw new IllegalArgumentException("Value may not be null.");
        }

        Matcher unformattedMatcher = unformatted.matcher(value);
        if(unformattedMatcher.matches()){
        	return value;
        }

        Matcher matcher = formatted.matcher(value);
        result = matchAndReplace(matcher, unformattedReplacement);
        return result;
    }

    public boolean isFormatted(String value) {
    	return formatted.matcher(value).matches();
    }

    public boolean canBeFormatted(String value) {
    	return unformatted.matcher(value).matches();
    }

    private String matchAndReplace(Matcher matcher, String replacement) {
        String result = null;
        if (matcher.matches()) {
            result = matcher.replaceAll(replacement);
        } else {
            throw new IllegalArgumentException("Value is not properly formatted.");
        }
        return result;
    }

    public BaseFormatter(Pattern formatted, String formattedReplacement, Pattern unformatted, String unformattedReplacement) {
        super();
        this.formatted = formatted;
        this.formattedReplacement = formattedReplacement;
        this.unformatted = unformatted;
        this.unformattedReplacement = unformattedReplacement;
    }

}