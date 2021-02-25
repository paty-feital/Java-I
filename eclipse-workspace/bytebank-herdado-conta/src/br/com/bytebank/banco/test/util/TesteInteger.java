package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteInteger {

	public static void main(String[] args) {
		
		int[] idade = new int[5]; // array primitivo
		idade[0] = 29;
		
		List numeros = new ArrayList(); // Lista sempre array de referencia, não aceita array primitivo
		numeros.add(idade); // funciona pois o java internamente cria um objeto e adiciona na
							// na lista a referencia do objeto
		numeros.add(29);    // Também funciona, pois realiza internamente a mesma coisa
		
        int idade2 = 29;//Integer
        
        // o que o java faz internamente (autoboxing)
        Integer idadeRef = Integer.valueOf(29); 
        int valor = idadeRef.intValue(); // (unboxing)
        
        System.out.println(valor);
        
        System.out.println(idadeRef.doubleValue());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES); 
        
        List<Integer> numeros2 = new ArrayList<Integer>();
        numeros2.add(idade2); // (autoxing)
        
        String s = args[0];//"10"

        // Integer numeros3 = Integer.valueOf(s); // parsing
        Integer numeros3 = Integer.parseInt(s); // parsing
        System.out.println(numeros3);
        
        Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);
        
//        Tamanho	Tipo primitivo	Wrappers
//        8 bytes	double			java.lang.Double
//        4 bytes	float			java.lang.Float
//        8 bytes	long			java.lang.Long
//        4 bytes	int				java.lang.Integer
//        2 bytes	short			java.lang.Short
//        1 bytes	byte			java.lang.Byte
//        2 bytes	char			java.lang.Character
//        			boolean			java.lang.Boolean
//
//		  Exemplos:
        
        Integer refIdade = Integer.valueOf(29); // autoboxing
        int valor1 = refIdade.intValue(); // (unboxing)
        
        Double dRef = Double.valueOf(3.2);//autoboxing
        System.out.println(dRef.doubleValue());//unboxing
        
        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());
        
        Number refNumero = Integer.valueOf(29); // Number é a classe mãe dos números
        
        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(25.6f);
        
	}

}
