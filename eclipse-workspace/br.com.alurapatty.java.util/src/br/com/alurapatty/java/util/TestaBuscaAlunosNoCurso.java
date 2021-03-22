package br.com.alurapatty.java.util;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		
		ClasseCurso javaColecoes = new ClasseCurso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new ClasseAula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new ClasseAula("Criando uma Aula", 20));
        javaColecoes.adiciona(new ClasseAula("Modelando com coleções", 24));

        ClasseAlunos a1 = new ClasseAlunos("Rodrigo Turini", 34672);
        ClasseAlunos a2 = new ClasseAlunos("Guilherme Silveira", 5617);
        ClasseAlunos a3 = new ClasseAlunos("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        
        System.out.println("Quem é o aluno com matricula 5617?");
        ClasseAlunos aluno = javaColecoes.buscaMatriculado(5617);
        System.out.println("Aluno: " + aluno);
        
        System.out.println("Quem é o aluno com matricula 5618?");
        aluno = javaColecoes.buscaMatriculado(5618);
        System.out.println("Aluno: " + aluno);

	}

}
