package br.com.alurapatty.java.util;

public class TesteCurso {

	public static void main(String[] args) {
		
		ClasseCurso javaCurso = new ClasseCurso("Java Colecoes", "Pat Felita");
		
		// Desta forma
		// List<ClasseAula> aulas = javaCurso.getAulas();
		// System.out.println(aulas);
		// aulas.add(new ClasseAula("Java Util List", 21));
		
		// ou Desta forma
		// javaCurso.getAulas().add(new ClasseAula ("Java Concepts", 16));
		
		// Ou com o método adicionado na classe ClasseCurso
		javaCurso.adiciona(new ClasseAula("ArrayList", 21));
		javaCurso.adiciona(new ClasseAula ("LinkedList", 18));
		javaCurso.adiciona(new ClasseAula ("Java Concepts", 16));
				
		System.out.println(javaCurso.getAulas());
		
		// javaCurso.getAulas().sort(null);
		// System.out.println(javaCurso.getAulas());
		
		// javaCurso.getAulas().sort(Comparator.comparing(ClasseAula::getTempo));
		// System.out.println(javaCurso.getAulas());
	}
}
