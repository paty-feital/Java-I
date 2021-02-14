package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(123, 12345);
		cc.deposita(200.0);
		System.out.println(cc.getSaldo());

		SeguroDeVida sv = new SeguroDeVida();
		
		CalculaImposto ci = new CalculaImposto();
		
		ci.registro(sv);
		ci.registro(cc);
		
		System.out.println("Total Imposto: " + ci.getTotalImposto());
	}

}
