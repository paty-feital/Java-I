package br.com.alurapaty.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScannerIO {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(new File("contas.csv"), "UTF-8");
		
		while(sc.hasNextLine()) {
			
			String linha = sc.nextLine();
			// System.out.println(linha);
			
			Scanner campo = new Scanner(linha);
			campo.useLocale(Locale.US);
			campo.useDelimiter(",");
			
			String tipoConta = campo.next();
			int agencia = campo.nextInt();
			int numero = campo.nextInt();
			String titular = campo.next();
			Double saldo = campo.nextDouble();
			
			System.out.format("%s - %04d-%08d, %20s: %06.2f %n", 
                    			tipoConta, agencia, numero, titular, saldo);
			
//			String[] campo = linha.split(",");
//			System.out.println(Arrays.toString(campo));
//			System.out.println(campo[3]);
			campo.close();
		}		        
        sc.close();
	}

}
