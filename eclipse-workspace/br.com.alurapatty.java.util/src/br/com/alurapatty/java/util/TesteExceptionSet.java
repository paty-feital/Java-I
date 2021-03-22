package br.com.alurapatty.java.util;

import java.util.Collections;
import java.util.Set;

public class TesteExceptionSet {

	public static void main(String[] args) {
		
		Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo"); //o que acontece aqui?
        //exception... se o conjunto tem que ser vazio não aceita add

	}

}
