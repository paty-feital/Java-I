package br.com.alurapatty.java.util;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoLista {

	public static void main(String[] args) {
		String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
        String curso2 = "Apache Camel";
        String curso3 = "Certificacao Java SE 8 Programmer I";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);        

        System.out.println(cursos);
        // como acessar o primeiro valor?
        System.out.println("O primeiro curso da lista eh o: " + cursos.get(0)); 

        Collections.sort(cursos);
        
        cursos.forEach(aula -> 
        	System.out.println(aula)
        );       
        
        cursos.remove(1);

        System.out.println(cursos);
	}

}
