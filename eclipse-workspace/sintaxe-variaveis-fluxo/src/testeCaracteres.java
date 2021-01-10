
public class testeCaracteres {
	
	public static void main(String[] args) {
		
		char letra = 'a';
		//numero convertido na tabela UNICODE
		System.out.println("letra " + letra);
		
		char valor = 66;
		System.out.println("letra " + valor);
		
		valor = (char) (valor + 1);
		//como 1 é int, int não cabe em char e por esta razão tenho que forçar char
		System.out.println("letra " + valor);
		
		String palavra = "Alura Cursos online de Tecnologia ";
		// String é mais utilizado do que char
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}

}
