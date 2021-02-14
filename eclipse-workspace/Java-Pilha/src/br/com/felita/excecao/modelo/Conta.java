package br.com.felita.excecao.modelo;

public abstract class Conta {
	
	private double saldo = 0;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

}
