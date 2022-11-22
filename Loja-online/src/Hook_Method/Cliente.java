package Hook_Method;

public abstract class Cliente {
    private String nome;
    private double carrinho;
    private String tipo;
    
    public Cliente(String nome, double carrinho, String tipo) {
		super();
		this.nome = nome;
		this.carrinho = carrinho;
                this.tipo = tipo;
	}

    public abstract double conta();
    
    public double carrinho(){
        return conta();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(double carrinho) {
        this.carrinho = carrinho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
