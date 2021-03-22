package br.com.alurapatty.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ExercicioReference {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

		// imprimindo em ordem alfabética
		Collections.sort(palavras);
		System.out.println(palavras);

//		palavras.sort((s1, s2) -> s1.length() - s2.length());
//		
//		palavras.forEach(s -> System.out.println(s));
		
		palavras.sort(Comparator.comparing(s -> s.length())); // com lambda
		
		palavras.forEach(System.out::println); // com Reference
		
		palavras.sort(Comparator.comparing(String::length)); // com Reference
		
		palavras.forEach(System.out::println);
		
		
		
	}

}