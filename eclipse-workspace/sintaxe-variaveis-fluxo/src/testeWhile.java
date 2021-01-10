
public class testeWhile {

	public static void main(String[] args) {
	
		int contador = 0;
		int total = 0;
		while(contador <= 10) {
			contador++;
			total += contador;
			System.out.println(contador + " " + total);
		}
		System.out.println(contador + " final");
		System.out.println(total + " final");
		
	}
	
}
