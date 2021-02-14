package br.com.bytebank.banco.modelo;


/**
* Classe que representa uma Fórmula de Calculo de Imposto no ByteBank
*
* @author Paty Feital
* @version 0.1
*/
public class CalculaImposto {
	
	private double totalImposto;

	public void registro(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}