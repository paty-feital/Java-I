package br.com.bytebank.banco.modelo;


/**
* Classe que representa uma Conta Poupança no ByteBank
*
* @author Paty Feital
* @version 0.1
*/
public class ContaPoupanca extends Conta {

        public ContaPoupanca(int agencia, int numero) {
            super(agencia, numero);
        }

		@Override
		public String toString() {
			return "ContaPoupanca, " + super.toString();
		}
}