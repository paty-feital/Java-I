
public class testaCondicional {
	
	public static void main(String[] args) {
		System.out.println("Testa Condicional");
		int idade = 16;
		int numeroPessoas = 1;
		if (idade >= 18) {
			System.out.println("Maioridade");
		} 
		else {
			if (numeroPessoas >=2) {
				System.out.println("Idade n�o autorizada, por�m menor acompanhado. Pode entrar.");
			} 
			else {
				System.out.println("Idade n�o autorizada, n�o poder� entrar.");
			}
		}
	}

}
