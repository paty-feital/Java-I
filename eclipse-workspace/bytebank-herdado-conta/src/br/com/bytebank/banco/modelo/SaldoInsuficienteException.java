package br.com.bytebank.banco.modelo;

/**
* Classe que representa um tratamento para uma exceção no ByteBank
*
* @author Paty Feital
* @version 0.1
*/
public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException() {
		// TODO Auto-generated constructor stub
	}

	public SaldoInsuficienteException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public SaldoInsuficienteException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public SaldoInsuficienteException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public SaldoInsuficienteException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
