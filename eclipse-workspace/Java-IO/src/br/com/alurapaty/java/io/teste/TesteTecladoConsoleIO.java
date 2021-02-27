package br.com.alurapaty.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
// import java.net.Socket;

public class TesteTecladoConsoleIO {

	public static void main(String[] args) throws IOException {
		
		// Para entrada e saída através de rede
		// Socket s = new Socket();
		
		//fluxo de entrada de arquivo
		InputStream fis = new FileInputStream("lorem.txt"); // s.getInputStream(); //System.in; 
		// Ler esntrada de fluxo
		Reader irs = new InputStreamReader(fis);
		// Bufferizar a leitura
		BufferedReader br = new BufferedReader(irs);
		
		// capturar a linha
		String linha = br.readLine();

		//fluxo de saída de arquivo
		OutputStream fos = new FileOutputStream("lorem3.txt"); // s.getOutputStream(); //System.out; 
		// Ler saída de fluxo
		Writer osw = new OutputStreamWriter(fos);
		// Bufferizar a escrita
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		// imprimir todas as linhas
        while(linha != null && !linha.isBlank()) {
    		bw.write(linha);
    		bw.newLine();
    		bw.flush();
            linha = br.readLine();
        }
        
        br.close();
        bw.close();
	}

}
