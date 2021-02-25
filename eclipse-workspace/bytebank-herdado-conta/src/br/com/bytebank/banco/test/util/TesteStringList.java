package br.com.bytebank.banco.test.util;

import java.util.Arrays;
import java.util.List;

public class TesteStringList {

	  public static void main(String[] args) {
	    List<String> argumentos = Arrays.asList(args);
	    
	    int tamanho = argumentos.size();
	    System.out.println(tamanho);
	    
        for(Object o : argumentos) {
        	System.out.println(o);
        }   
	  }
	}
