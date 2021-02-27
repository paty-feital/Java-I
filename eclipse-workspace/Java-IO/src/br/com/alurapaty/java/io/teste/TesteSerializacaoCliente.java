package br.com.alurapaty.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Cliente cl = new Cliente();
		cl.setNome("Nico");
		cl.setCpf("222.222.222-22");
		cl.setProfissao("Dev");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cl);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cl1 = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cl1.getCpf());

  }
}