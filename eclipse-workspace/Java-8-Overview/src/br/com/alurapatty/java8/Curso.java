package br.com.alurapatty.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
    
    public static void main(String[] args) {
		
    	List<Curso> cursos = new ArrayList<Curso>();
    	cursos.add(new Curso("Python", 45));
    	cursos.add(new Curso("JavaScript", 150));
    	cursos.add(new Curso("Java 8", 113));
    	cursos.add(new Curso("C", 55));
    	
    	cursos.sort(Comparator.comparingInt(Curso::getAlunos));
    	
    	cursos.forEach(c -> System.out.println(c.getNome() + " - " + c.getAlunos()));
    	
    	cursos.stream()
    	   .filter(c -> c.getAlunos() > 100) // listar cursos acima de 100 alunos
    	   .forEach(c -> System.out.println(c.getNome() + " - " + c.getAlunos()));
    	
    	cursos.stream()
    	   .filter(c -> c.getAlunos() > 100)
    	   .map(c -> c.getAlunos())
    	   .forEach(x -> System.out.println(x));
    	
    	cursos.stream()
	 	   .filter(c -> c.getAlunos() > 100)
	 	   .map(Curso::getAlunos)
	 	   .forEach(System.out::println);
 	    	
    	int soma = cursos.stream()
	    			   .filter(c -> c.getAlunos() > 100)
	    			   .mapToInt(Curso::getAlunos)
	    			   .sum();
    		System.out.println(soma);
	}
}