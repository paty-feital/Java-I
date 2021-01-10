
public class testeEscopo {

	public static void main(String[] args) {
		System.out.println("Testa Condicional");
		int idade = 18;
		int numeroPessoas = 1;
		if (idade >= 18 || numeroPessoas >=2) {
			System.out.println("Autorizado");
		} 
		else {
				System.out.println("Não autorizado, não poderá entrar.");
			}
		idade = 18;
		boolean acompanhado = false;
		if (idade >= 18 || acompanhado) {
			System.out.println("Autorizado!!!");
		} 
		else {
				System.out.println("Não autorizado, não poderá entrar!!");
			}
		idade = 16;
		numeroPessoas = 2;
		acompanhado = numeroPessoas >= 2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		if (idade >= 18 || acompanhado) {
			System.out.println("Autorizado - Expressão booleana");
		} 
		else {
				System.out.println("Não autorizado, expressão booleana!!");
			}
	}
}
