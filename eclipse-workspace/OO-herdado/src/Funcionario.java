// abstract para classe significa que n�o poder�ser gerada uma inst�ncia para ela. 
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	// m�todo abstract significa que n�o tem implementa��o na superclasse, 
	// sendo mandat�ria a sua implementa��o para os filhos
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