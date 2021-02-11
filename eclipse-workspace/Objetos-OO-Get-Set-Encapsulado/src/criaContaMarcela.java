
public class criaContaMarcela {
	
	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta(134, 2235);
		System.out.println(Conta.getTotal());
		contaDaMarcela.deposita(100);
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDaMarcela.getAgencia());
		System.out.println(contaDaMarcela.getNumero());
		
		System.out.println(contaDaMarcela.getTitular());
		
		contaDaMarcela.setTitular(new Cliente());
		System.out.println(contaDaMarcela.getTitular());
		
		contaDaMarcela.getTitular().setNome("Marcela");
		System.out.println(contaDaMarcela.getTitular().getNome());
		
		contaDaMarcela.getTitular().setCpf("222.222.222-22");
		System.out.println(contaDaMarcela.getTitular().getCpf());
		
		contaDaMarcela.getTitular().setProfissao("programador");
		System.out.println(contaDaMarcela.getTitular().getProfissao());
		
		Conta contaDaPatricia = new Conta(134, 2257);
		System.out.println(Conta.getTotal());
		contaDaPatricia.deposita(100);
		System.out.println(contaDaPatricia.getSaldo());
		System.out.println(contaDaPatricia.getAgencia());
		System.out.println(contaDaPatricia.getNumero());
		
		System.out.println(contaDaPatricia.getTitular());
		
		contaDaPatricia.setTitular(new Cliente());
		System.out.println(contaDaPatricia.getTitular());
		
		contaDaPatricia.getTitular().setNome("Patricia");
		System.out.println(contaDaPatricia.getTitular().getNome());
		
		contaDaPatricia.getTitular().setCpf("333.222.222-33");
		System.out.println(contaDaPatricia.getTitular().getCpf());
		
		contaDaPatricia.getTitular().setProfissao("programadora");
		System.out.println(contaDaPatricia.getTitular().getProfissao());
		
		Conta contaDoPaulo = new Conta(155, 3317);
		System.out.println(Conta.getTotal());
		contaDoPaulo.deposita(100);
		System.out.println(contaDoPaulo.getSaldo());
		System.out.println(contaDoPaulo.getAgencia());
		System.out.println(contaDoPaulo.getNumero());
		
		System.out.println(contaDoPaulo.getTitular());
		
		contaDoPaulo.setTitular(new Cliente());
		System.out.println(contaDoPaulo.getTitular());
		
		contaDoPaulo.getTitular().setNome("Paulo");
		System.out.println(contaDoPaulo.getTitular().getNome());
		
		contaDoPaulo.getTitular().setCpf("444.222.222-44");
		System.out.println(contaDoPaulo.getTitular().getCpf());
		
		contaDoPaulo.getTitular().setProfissao("programador");
		System.out.println(contaDoPaulo.getTitular().getProfissao());
		
	}
}
