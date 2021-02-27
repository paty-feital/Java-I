package br.com.bytebank.banco.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacaoConta {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Cliente cl = new Cliente();
		cl.setNome("Nico");
		cl.setCpf("222.222.222-22");
		cl.setProfissao("Dev");
		
		Conta cc = new ContaCorrente(22, 33);
		cc.deposita(342.10);
		cc.setTitular(cl);
				
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		Conta cc1 = (Conta) ois.readObject();
		System.out.println(cc1.getTitular());
		ois.close();

  }
}