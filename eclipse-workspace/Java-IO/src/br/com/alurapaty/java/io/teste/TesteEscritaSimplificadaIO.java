package br.com.alurapaty.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaSimplificadaIO {

	public static void main(String[] args) throws IOException {
		
		//fluxo de saída de arquivo
		// OutputStream fos = new FileOutputStream("lorem2.txt");
		// Ler saída de fluxo
		// Writer osw = new OutputStreamWriter(fos);
		// Bufferizar a escrita
		
		// BufferedWriter bw = new BufferedWriter(new FileWriter("lorem3.txt"));
		
        //PrintStream ps = new PrintStream(new File("lorem3.txt"));

        PrintWriter pw = new PrintWriter("lorem3.txt", "UTF-8");
		
		pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		pw.println();
		pw.println("Testando escrita no arquivo lorem3.txt");
        
        pw.close();
	}

}
