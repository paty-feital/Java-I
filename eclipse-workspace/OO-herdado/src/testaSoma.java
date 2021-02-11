
public class testaSoma {

	public static void main(String[] args) {

		Funcionario g1 = new Gerente();
		g1.setSalario(5000.00);
		
		Funcionario e1 = new Editor();
		e1.setSalario(3000.00);
		
		Designer d = new Designer();
		d.setSalario(4000.00);
		
		Soma soma = new Soma();
		soma.registra(e1);
		System.out.println(soma.getSoma());
		soma.registra(g1);
		System.out.println(soma.getSoma());
		soma.registra(d);
		
		System.out.println(soma.getSoma());

	}

}
