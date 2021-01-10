
public class testaPontoFlutuante {
	
	public static void main(String[] args) {
		
		double salario;
		salario = 1270.45;
		System.out.println("O Salario é: " + salario + "!");
		
		double numero = 3.14 / 2;
		System.out.println("O Numero é: " + numero + "!");
		
		int outroNumero = 5 / 2;
		System.out.println("O Outro Numero é: " + outroNumero + "!");
		
		double novoNumero = 5 / 2;
		System.out.println("O Novo Numero é: " + novoNumero + "!");
		// como o java lê da direita para a esquerda ela "pensa" que tratam-se de numeros inteiros
		
		double novoNumeroCorreto = 5.0 / 2;
		System.out.println("O Novo Numero Correto é: " + novoNumeroCorreto + "!");
		// truque para que o java intenda tratar-se de numeros com ponto flutuante
		
		int dia = 4;
		int outroDia = 4 + dia;
		System.out.println(outroDia);
		
		double peso = 4.0;
		int quantidade = 10;
		System.out.println(peso * quantidade);
		
		double preco = 5.5;
		int ingressos = 4;
		System.out.println(preco * ingressos);
		
	}

}
