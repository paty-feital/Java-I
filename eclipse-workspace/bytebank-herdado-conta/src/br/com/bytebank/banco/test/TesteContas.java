package br.com.bytebank.banco.test;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.*;

public class TesteContas {

        public static void main(String[] args) {
        	
        	Conta ce = new ContaEspecial(123, 12345);
        	System.out.println(ce.getSaldo());

            ContaCorrente cc = new ContaCorrente(111, 111);
            cc.deposita(100.0);

            ContaPoupanca cp = new ContaPoupanca(111, 222);
            cp.deposita(200.0);

            try {
            cc.transfere(10.0, cp);
            } catch(Exception ex) {
            	System.out.println("Ex: " + ex.getMessage());
            }
            
            System.out.println("CC: " + cc.getSaldo());
            System.out.println("CP: " + cp.getSaldo());
            
            System.out.println(cc);
            System.out.println(cp);

        }
}
