
public class testeEscopo {

	public static void main(String[] args) {
		System.out.println("Testa Condicional");
		int idade = 18;
		int numeroPessoas = 1;
		if (idade >= 18 || numeroPessoas >=2) {
			System.out.println("Autorizado");
		} 
		else {
				System.out.println("N�o autorizado, n�o poder� entrar.");
			}
		idade = 18;
		boolean acompanhado = false;
		if (idade >= 18 || acompanhado) {
			System.out.println("Autorizado!!!");
		} 
		else {
				System.out.println("N�o autorizado, n�o poder� entrar!!");
			}
		idade = 16;
		numeroPessoas = 2;
		acompanhado = numeroPessoas >= 2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		if (idade >= 18 || acompanhado) {
			System.out.println("Autorizado - Express�o booleana");
		} 
		else {
				System.out.println("N�o autorizado, express�o booleana!!");
			}
	}
}
