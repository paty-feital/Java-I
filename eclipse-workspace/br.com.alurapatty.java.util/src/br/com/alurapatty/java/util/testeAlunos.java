package br.com.alurapatty.java.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class testeAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        
        //Não aceita valores repetidos
        
        System.out.println(alunos.size());
        
        alunos.add("Mauricio Aniche");
        
        System.out.println(alunos.size());
        
        System.out.println(alunos);
        
        alunos.forEach(aluno -> {
        	System.out.println(aluno);
        });
	
        ArrayList<String> alunosEmOrdem = new ArrayList<>(alunos);
        
        Collections.sort(alunosEmOrdem);
        
        System.out.println(alunosEmOrdem);
        
        boolean sergioPresente = alunos.contains("Sergio Lopes");
        
        boolean patPresente = alunos.contains("Patricia Feital");
        
        System.out.println(sergioPresente);
        System.out.println(patPresente);
	}
}
