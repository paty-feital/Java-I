
public class testeIRcomIFeBoolean {
	
	public static void main(String[] args) {

        double salario = 4500.0;
        double valorIR = 0.0;
        
        // De 1900.0 at� 2800.0, o IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142
        // De 2800.01 at� 3751.0, o IR � de 15% e pode deduzir R$ 350
        // De 3751.01 at� 4664.00, o IR � de 22.5% e pode deduzir R$ 636
        // Acima de 4663.00, IR � de 27,5 e pode deduzir R$ 869

        if(salario >= 1900 && salario <= 2800.0) {
        	valorIR = (salario * 0.075) - 142.0;
        	System.out.println("A sua aliquota � de 7,5%");
            System.out.println("Voc� pode deduzir at� R$ 142");
        } 
        else { 
        	 if(salario > 2800.0 && salario <= 3751.0) {
        		 valorIR = (salario * 0.15) - 350.0;
                 System.out.println("A sua aliquota � de 15%");
                 System.out.println("Voc� pode deduzir at� R$ 350");
        	 } 
        else {
        	 if(salario > 3751.0 && salario <= 4664.0) {
        		 valorIR = (salario * 0.225) - 636.0;
        		 System.out.println("A sua aliquota � de 22.5%");
                 System.out.println("Voc� pode deduzir at� R$ 636");
        	 }
        else {
        	 if(salario > 4664.0) {
                 valorIR = (salario * 0.275) - 869.0;
                 System.out.println("A sua aliquota � de 27.5%");
                 System.out.println("Voc� pode deduzir at� R$ 869");
        }
        }
        }
        }
        
        System.out.println("o IR para o sal�rio de " + salario + " � de " + valorIR);
    }
}
