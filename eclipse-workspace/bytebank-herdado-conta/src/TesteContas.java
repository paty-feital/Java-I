
public class TesteContas {

        public static void main(String[] args) {

            ContaCorrente cc = new ContaCorrente(111, 111);
            cc.deposita(100.0);

            ContaPoupanca cp = new ContaPoupanca(111, 222);
            cp.deposita(200.0);

            try {
            cc.transfere(10.0, cp);
            } catch(Exception ex) {
            	System.out.println("Ex: " + ex.getMessage());
            }
            
            System.out.println("CC: " + cc.getSaldo());
            System.out.println("CP: " + cp.getSaldo());

        }
}
