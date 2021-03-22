package br.com.alurapatty.java.util;

public class ClasseAula implements Comparable<ClasseAula> {
	
    private String titulo;
    private int tempo;
	
    public ClasseAula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }
    
    @Override
    public String toString() {
    	return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }
    
    @Override
    public int compareTo(ClasseAula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
        
    }
}