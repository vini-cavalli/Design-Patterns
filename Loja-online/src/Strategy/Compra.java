package Strategy;

public class Compra {
    double valor;
    
    public Compra(double valor) {
        this.valor = valor;
    }
    
    public void processarCompra(EstrategiaPagamento estrategiaPagamento) {
        estrategiaPagamento.pagar(this);
    }
    
}
