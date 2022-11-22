package Strategy;

public class Main {

    public static void main(String[] args) {
        
        //Compra fatura001 = new Compra(100);
        //fatura001.processarCompra(new PagamentoCredito());
        
//        Compra fatura002 = new Compra(100);
//        fatura002.processarCompra(new PagamentoDebito());
        
        Compra fatura003 = new Compra(100);
        fatura003.processarCompra(new PagamentoBoleto());
        
    }

}
