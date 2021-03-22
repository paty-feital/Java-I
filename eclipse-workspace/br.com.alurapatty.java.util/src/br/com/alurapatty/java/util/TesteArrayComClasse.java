package br.com.alurapatty.java.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteArrayComClasse {

	public static void main(String[] args) {

        ClasseAula a1 = new ClasseAula("Revistando as ArrayLists", 21);
        ClasseAula a2 = new ClasseAula("Listas de objetos", 20);
        ClasseAula a3 = new ClasseAula("Relacionamento de listas e objetos", 15);
		
        ArrayList<ClasseAula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);  

        // antes de ordenar:
        System.out.println(aulas);

        Collections.sort(aulas);

        // depois de ordenar:
        System.out.println(aulas);
        
        aulas.sort(Comparator.comparing(ClasseAula::getTempo));
        System.out.println(aulas);
	}
}
