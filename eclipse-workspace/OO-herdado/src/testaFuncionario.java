
public class testaFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Designer();
		nico.setNome("Nico Steppat");
		nico.setSalario(2600.00);
		nico.setCpf("223355646-9");
		
        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
		
	}

}
