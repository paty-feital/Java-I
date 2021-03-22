package br.com.alurapatty.java.util;

public class ClasseAlunos {
	
	private String nome;
	private int numeroMatricula;
	
	public ClasseAlunos(String nome, int numeroMatricula) {
		if (nome == null || nome.isEmpty()) {
	        throw new NullPointerException("Nome não pode ser nulo");
	    }
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + numeroMatricula;
        return result;
    }
	
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ClasseAlunos other = (ClasseAlunos) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (numeroMatricula != other.numeroMatricula)
            return false;
        return true;
    }

	@Override
	public String toString() {
		return "Alunos [nome=" + nome + ", numeroMatricula=" + numeroMatricula + "]";
	}
}
