// abstract para classe significa que não poderáser gerada uma instância para ela. 
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	// método abstract significa que não tem implementação na superclasse, 
	// sendo mandatória a sua implementação para os filhos
    public abstract double getBonificacao();
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}