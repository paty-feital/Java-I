
public class Gerente extends Funcionario implements Autentica {
	
    private Autenticador aut;
    
    public Gerente() {
    	this.aut = new Autenticador();
    }
	
	@Override
	public double getBonificacao() {
		System.out.println("Gerente");
		return 50;
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