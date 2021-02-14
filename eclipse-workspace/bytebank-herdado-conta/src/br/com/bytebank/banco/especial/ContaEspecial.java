package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

/**
* Classe que representa uma Conta Especial no ByteBank
*
* @author Paty Feital
* @version 0.1
*/
public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		
	}
	@Override
    public void deposita(double valor) {
        this.saldo += valor;
    }

}
