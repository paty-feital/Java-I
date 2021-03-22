package br.com.alurapatty.java.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ClasseCurso {
	
	private String nome;
	private String instrutor;
	private List<ClasseAula> aulas = new LinkedList<ClasseAula>();
	private Set<ClasseAlunos> alunos = new HashSet<>();
	private Map<Integer, ClasseAlunos> chaveAluno = new HashMap<>();
	
	public ClasseCurso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<ClasseAula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(ClasseAula aula) {
		this.aulas.add(aula);
	}
	
	// opção com for
//	public int getTempoTotal() {
//		int tempoTotal = 0;
//		for (ClasseAula aula : aulas) 
//			tempoTotal += aula.getTempo();
//		return tempoTotal;
//	}
	// opção com stream a partir do Java 8	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(ClasseAula::getTempo).sum();
	}
	
	public void matricula(ClasseAlunos aluno) {
		this.alunos.add(aluno);
		this.chaveAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<ClasseAlunos> getAlunos() {
	    return Collections.unmodifiableSet(alunos);
	}
	
	@Override
	public String toString() {
	    return "[Curso: "+ this.getNome() +",tempo total: "+ this.getTempoTotal()+ 
	    		", aulas: " + this.aulas + " Alunos: " + this.alunos + "]";
	}

	public boolean estaMatriculado(ClasseAlunos aluno) {
		return this.alunos.contains(aluno);
	}
	
	public ClasseAlunos buscaMatriculado(int numero) {
	    return this.chaveAluno.get(numero);
	}
}

