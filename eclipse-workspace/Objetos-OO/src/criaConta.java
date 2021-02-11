
public class criaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Saldo primeira conta é " + primeiraConta.saldo);
		System.out.println("Saldo segunda conta é " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia + " " + primeiraConta.numero);
		
		Conta newPrimeiraConta = primeiraConta;
		// Neste caso foi copiada a referência, que aponta para o mesmo objeto
		
		newPrimeiraConta.saldo += 50.0;
		
		System.out.println(primeiraConta.saldo);
		
		// Este exemplo mostra bem como a referência são iguais para primeiraConta e newPrimeiraConta
		// pois apontam para o mesmo objeto e diferente para segundaConta por apontar para outro objeto
		System.out.println(primeiraConta);
		System.out.println(newPrimeiraConta);
		System.out.println(segundaConta);
		
	}
}
