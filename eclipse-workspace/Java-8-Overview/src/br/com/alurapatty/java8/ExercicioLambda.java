package br.com.alurapatty.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ExercicioLambda {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do c�digo");
		palavras.add("caelum");

		// imprimindo em ordem alfab�tica
		Collections.sort(palavras);
		System.out.println(palavras);

		// Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		// Collections.sort(palavras, comparador);

		// Utilizando o lmbda '->' que j� subintende todas as fun��es definidas
		// anteriormente na classe 'ComparadorDeStringPorTamanho'

		palavras.sort((s1, s2) -> s1.length() - s2.length());

		// Consumer<String> consumidor = new ConsumidorDeString();
		// palavras.forEach(consumidor);
		
		// Utilizando o lmbda '->' que j� subintende todas as fun��es definidas
		// anteriormente na classe 'ConsumidorDeString'

		palavras.forEach(s -> System.out.println(s));
	}

}

//class ComparadorDeStringPorTamanho implements Comparator<String> {
//
//	public int compare(String s1, String s2) {
//		if (s1.length() < s2.length())
//			return -1;
//		if (s1.length() > s2.length())
//			return 1;
//		return 0;
//	}
//}
//
//class ConsumidorDeString implements Consumer<String> {
//    public void accept(String s) {
//        System.out.println(s);
//    }
//}