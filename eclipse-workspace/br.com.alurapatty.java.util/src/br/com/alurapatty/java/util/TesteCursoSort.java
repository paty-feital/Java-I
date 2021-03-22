package br.com.alurapatty.java.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class TesteCursoSort {

	public static void main(String[] args) {
		
		ClasseCurso javaCurso = new ClasseCurso("Java Colecoes", "Pat Felita");
		
		// Ou com o método adicionado na classe ClasseCurso
		javaCurso.adiciona(new ClasseAula("ArrayList", 21));
		javaCurso.adiciona(new ClasseAula ("LinkedList", 18));
		javaCurso.adiciona(new ClasseAula ("Java Concepts", 16));
		
        ClasseAlunos a1 = new ClasseAlunos("Rodrigo Turini", 34672);
        ClasseAlunos a2 = new ClasseAlunos("Guilherme Silveira", 5617);
        ClasseAlunos a3 = new ClasseAlunos("Mauricio Aniche", 17645);
        
        javaCurso.matricula(a1);
        javaCurso.matricula(a2);
        javaCurso.matricula(a3);
		
		System.out.println(javaCurso);
        
		ArrayList<ClasseAula> aulasImutaveis = new ArrayList<ClasseAula>(javaCurso.getAulas());
		
		Collections.sort(aulasImutaveis);
		
		System.out.println(aulasImutaveis);
		
		System.out.println("Todos os alunos matriculados: ");
		javaCurso.getAlunos().forEach(aluno -> {
				System.out.println(aluno);
		});
		
		System.out.println("Com Iterator");
		Set<ClasseAlunos> alunos = javaCurso.getAlunos();
		Iterator<ClasseAlunos> iterador = alunos.iterator();

		while (iterador.hasNext()) {
		    System.out.println(iterador.next());
		}
		
		System.out.println("O aluno " + a1.getNome() + " está matriculado?");
		System.out.println(javaCurso.estaMatriculado(a1));
		
		ClasseAlunos turini = new ClasseAlunos("Rodrigo Turini", 34672);
		
		System.out.println("O aluno " + turini.getNome() + " está matriculado?");
		System.out.println(javaCurso.estaMatriculado(turini));
		
		System.out.println("O a1 é equals ao Turini?");
		System.out.println(a1.equals(turini));
		
	}
}
