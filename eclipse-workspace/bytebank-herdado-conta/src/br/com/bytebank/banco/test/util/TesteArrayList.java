package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        System.out.println("Tamanho: " + lista.size());
        
        lista.remove(0);
        
        System.out.println("Tamanho: " + lista.size());
        
        Conta cc3 = new ContaCorrente(22, 31);
        lista.add(cc3);

        Conta cc4 = new ContaPoupanca(22, 32);
        lista.add(cc4);
        
        System.out.println("Tamanho: " + lista.size());
        
        for(int i = 0; i < lista.size(); i++) {
        	Conta oref = lista.get(i);
        	System.out.println(oref);
        }
        //for econômico e mais usual
        
        System.out.println("------------------------");
        
        for(Conta o : lista) {
        	System.out.println(o);
        }      
	}

}
