
public class Cliente implements Autentica {

        private Autenticador aut;

        public Cliente() {
        	this.aut = new Autenticador();
        }
        
        
        @Override
        public void setSenha(int senha) {
            this.aut.setSenha(senha);
        }

        @Override
        public boolean autentica(int senha) {
            return this.aut.autentica(senha);
        }
}