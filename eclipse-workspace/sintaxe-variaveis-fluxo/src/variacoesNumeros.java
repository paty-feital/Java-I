
public class variacoesNumeros {
	
	public static void main(String[] args) {
		
		double salario = 1270.50;
        int valor = (int) salario; 
        // for�a java converter double para int
        System.out.println(valor);
        
        long numeroGrande = 32432423523L;
        // para numeros gigantes
        
        short valorPequeno = 2131;
        // para numeros pequenos at� 256 bits
        
        byte b = 127;
        // para numeros ainda menores de -128 at� 127 - 1 byte - 8 bits
        
        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1+valor2;
        System.out.println(total);
        // demonstra que double n�o pode ser utilizado para dinheiro 
        // esta soma, por exemplo traz o resultado de 0.30000000000000004 (IEEE 754)
        // Existe at� o site 0.30000000000000004.com, com a explica��o matem�tica para esse floating point.
        
        float pontoFlutuante = 3.14f;
        // double 64bits - float 32bits - o f no final faz um numero de 64bits caber em 32bits
        
        // TIPO		TAMANHO
        // boolean	1 bit 
        // byte		1 byte -> 8 bits
        // short	2 bytes -> 16 bits
        // char		2 bytes -> 16 bits
        // int		4 bytes	-> 32 bits
        // float	4 bytes	-> 32 bits
        // long		8 bytes	-> 64 bits
        // double	8 bytes	-> 64 bits
        
	}

}
