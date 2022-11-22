package Hook_Method;

public class Cliente_Comum extends Cliente{
    
    public Cliente_Comum(String nome, double carrinho, String tipo){
        super(nome, carrinho, "(C)");
    }
    
    public double conta(){
        return this.getCarrinho();
    }

}
