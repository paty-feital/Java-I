
public class testeIR {

	public static void main(String[] args) {

		double salario = 2500.0;

		if (salario < 2600.0) {
			System.out.println("A sua aliquota � de 15%");
			System.out.println("Voc� pode deduzir at� R$ 350");
		} 

		if (salario > 3750.0) {
			System.out.println("A sua aliquota � de 22,5%");
			System.out.println("Voc� pode deduzir at� R$ 636");
		}
	}

}
