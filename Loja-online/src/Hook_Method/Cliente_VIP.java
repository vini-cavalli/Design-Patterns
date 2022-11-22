package Hook_Method;

public class Cliente_VIP extends Cliente{
    
    public Cliente_VIP(String nome, double carrinho, String tipo){
        super(nome, carrinho, "(VIP)");
    }
    
    public double conta(){
        return this.getCarrinho() - (getCarrinho()* 0.10);
    }
    
}
