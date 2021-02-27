package br.com.alurapaty.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaIO {

	public static void main(String[] args) throws IOException {
		
		//fluxo de saída de arquivo
		OutputStream fos = new FileOutputStream("lorem2.txt");
		// Ler saída de fluxo
		Writer osw = new OutputStreamWriter(fos);
		// Bufferizar a escrita
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.write("Testando escrita no arquivo lorem2.txt");
        
        bw.close();
	}

}
