package br.com.bytebank.banco.modelo;

/**
* Classe que representa o imposto espec�fico para o Seguro de Vida no ByteBank
*
* @author Paty Feital
* @version 0.1
*/
public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}
