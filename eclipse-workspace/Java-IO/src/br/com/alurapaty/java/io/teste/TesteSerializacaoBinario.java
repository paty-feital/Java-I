package br.com.alurapaty.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoBinario {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		String nome = "Nico Steppat";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject(nome);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome1 = (String) ois.readObject();
		ois.close();
		System.out.println(nome1);

  }
}