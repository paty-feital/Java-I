
public class movimentarConta {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(200);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.deposita(100);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(50);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		conseguiuRetirar = contaDoPaulo.saca(550);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean conseguiuTransferir = contaDaMarcela.transfere(300, contaDoPaulo);
		if(conseguiuTransferir) {
			System.out.println("Tranferência realizada com sucesso");
		} else {
			System.out.println("Tranferência não realizada");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
	}
}
