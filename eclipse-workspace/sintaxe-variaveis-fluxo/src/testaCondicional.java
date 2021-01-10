
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
				System.out.println("Idade não autorizada, porém menor acompanhado. Pode entrar.");
			} 
			else {
				System.out.println("Idade não autorizada, não poderá entrar.");
			}
		}
	}

}
