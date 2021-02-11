
public class testaGerente {

	public static void main(String[] args) {
		
		Gerente pat = new Gerente();
		pat.setNome("Pat Felita");
		pat.setCpf("555.555.555-55");
		pat.setSalario(5000.00);
		
		System.out.println(pat.getNome());
		System.out.println(pat.getCpf());
		System.out.println(pat.getSalario());
		System.out.println(pat.getBonificacao());
		
        pat.setSenha(2222);
        boolean autenticou = pat.autentica(2222);

        System.out.println(autenticou);

        System.out.println(pat.getBonificacao());

	}

}