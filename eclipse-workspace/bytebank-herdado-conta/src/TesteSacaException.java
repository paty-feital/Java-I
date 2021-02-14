
public class TesteSacaException {

	public static void main(String[] args) {

		Conta c = new ContaCorrente(123, 321);
		
		c.deposita(100.0);
		
		try {
		c.saca(250.0);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println("Saldo atual: " + c.getSaldo());
	}

}
