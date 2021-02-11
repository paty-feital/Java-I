
public class criaContaPaulo {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(1000);
		
		// por ser privado n�o podemos manipular o saldo diretamente, somente atrav�s de m�todo
		System.out.println(contaDoPaulo.retornaSaldo());
		
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular.cpf);
		System.out.println(contaDoPaulo.titular.profissao);
		
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
	}
}
