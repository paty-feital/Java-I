public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		if(!setAgencia(agencia) || !setNumero(numero)) {
			System.out.println("Não foi possível Criar a Conta");
			System.exit(1);
		} else {
			System.out.println("Conta criada com sucesso");
			Conta.total++;
		}
		
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public boolean setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Numero de Agencia inválido");
			return false;
		}
		this.agencia = agencia;
		return true;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public boolean setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Numero de Conta inválido");
			return false;
		}
		this.numero = numero;
		return true;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}