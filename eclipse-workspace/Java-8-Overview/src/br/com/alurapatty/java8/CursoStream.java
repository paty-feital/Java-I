package br.com.alurapatty.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class CursoStream {
    private String nome;
    private int alunos;

    public CursoStream(String nome, int alunos) {
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
		
    	List<CursoStream> cursos = new ArrayList<CursoStream>();
    	cursos.add(new CursoStream("Python", 45));
    	cursos.add(new CursoStream("JavaScript", 150));
    	cursos.add(new CursoStream("Java 8", 113));
    	cursos.add(new CursoStream("C", 55));
    	
    	cursos.sort(Comparator.comparingInt(CursoStream::getAlunos));
    	
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
	 	   .map(CursoStream::getAlunos)
	 	   .forEach(System.out::println);
 	    	
    	int soma = cursos.stream()
	    			   .filter(c -> c.getAlunos() > 100)
	    			   .mapToInt(CursoStream::getAlunos)
	    			   .sum();
    		System.out.println(soma);
    		
        OptionalDouble media = cursos.stream()
        		        	    .mapToInt(c -> c.getAlunos())
        		        	    .average();
 				System.out.println(media);
 		
    		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .findAny()
		   .ifPresent(c -> System.out.println(c.getNome()));
		
		cursos = cursos.stream()
				   .filter(c -> c.getAlunos() < 100)
				   .collect(Collectors.toList());
		
		cursos.stream()
			.forEach(c -> System.out.println(c.getNome() + " - " + c.getAlunos()));
		
		Map mapa = cursos 
				.stream() 
				.filter(c -> c.getAlunos() < 100) 
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
		
		System.out.println(mapa);
		
		List<CursoStream> cursosFiltrados = cursos.stream()
				   	.filter(c -> c.getAlunos() > 50)
				   	.collect(Collectors.toList());
		
		cursosFiltrados.forEach(c -> System.out.println(c.getNome() + " - " + c.getAlunos()));
	}
}