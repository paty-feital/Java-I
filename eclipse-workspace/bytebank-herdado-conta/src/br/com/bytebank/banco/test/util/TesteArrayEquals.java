package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayEquals {

	public static void main(String[] args) {
		
        // ArrayList<Conta> lista = new ArrayList<Conta>();
		// LinkedList<Conta> lista = new LinkedList<Conta>();
		// List<Conta> lista = new LinkedList<Conta>();
		List<Conta> lista = new Vector<Conta>(); //thread safe
		
		// List<Conta> lista = new ArrayList<Conta>();
				
        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        Conta cc3 = new ContaCorrente(22, 22);
        
        // usando o equals do Object reescrito na classe conta
        // outro modulo interessante: hashCode()
        
        boolean existe = lista.contains(cc3);
        
        System.out.println("Tamanho: " + lista.size());
       
        System.out.println("Já existe? " + existe);

        for(Conta o : lista) {
        	System.out.println(o);
        }      
	}

}
