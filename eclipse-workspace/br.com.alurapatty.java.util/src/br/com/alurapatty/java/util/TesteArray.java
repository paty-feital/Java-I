package br.com.alurapatty.java.util;

import java.util.ArrayList;
import java.util.Collections;

public class TesteArray {

	public static void main(String[] args) {
		
        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);  
        
//        System.out.println(aulas);
//        
//        for (String aula : aulas) {
//			System.out.println(aula);
//		}
//        
//        aulas.sort(null);
//        
//        for (int i = 0; i < aulas.size(); i++) {
//            System.out.println("aula : " + aulas.get(i));
//        }
        Collections.sort(aulas);
        
        aulas.forEach(aula -> 
        	System.out.println(aula)
        );       
        
	}

}
