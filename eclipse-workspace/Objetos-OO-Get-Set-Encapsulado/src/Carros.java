public class Carros{
    private int ano;
    private String modelo;
    private double preco;
    
    public Carros(int ano, String modelo, double preco) {
    	setAno(ano);
        if(!setModelo(modelo) || !setPreco(preco)) {
        	System.out.println("Informações do Carro inválidas");
        	System.exit(1);
        } else {
        	System.out.println("Carro adicionado com sucesso");
        }
    }
    
    //Novo construtor AQUI!
    
    public Carros(String modelo, double preco) {
    //chamando o construtor que recebe int, String e double. Nosso primeiro!    
        this(2017, modelo, preco);
    }
    
	public int getAno() {
		return this.ano;
	}
	public boolean setAno(int ano) {
		if(ano <= 1891) {
			System.out.println("Ano Inválido, por esta razão utilizaremos o ano de 2017");
			this.ano = 2017;
			return true;
		} else {
		this.ano = ano;
		return true;
		}
	}
	public String getModelo() {
		return this.modelo;
	}
	public boolean setModelo(String modelo) {
		if(modelo == null) {
			System.out.println("Modelo Inválido");
			return false;
		} else {
		this.modelo = modelo;
		return true;
		}
	}
	public double getPreco() {
		return this.preco;
	}
	public boolean setPreco(double preco) {
		if(preco <= 0) {
			System.out.println("Preco Inválido");
			return false;
		} else {
		this.preco = preco;
		return true;
		}
	}

    //getters e setters omitidos        

}