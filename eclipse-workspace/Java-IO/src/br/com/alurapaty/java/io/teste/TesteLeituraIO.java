package br.com.alurapaty.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeituraIO {

	public static void main(String[] args) throws IOException {
		
		//fluxo de entrada de arquivo
		InputStream fis = new FileInputStream("lorem.txt");
		// Ler esntrada de fluxo
		Reader irs = new InputStreamReader(fis);
		// Bufferizar a leitura
		BufferedReader br = new BufferedReader(irs);
		
		// capturar a linha
		String linha = br.readLine();
		System.out.println(linha);
		System.out.println("------");
		
		// imprimir todas as linhas
        while(linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
        
        br.close();
	}

}
