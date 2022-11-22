package Strategy;

public class PagamentoDebito implements EstrategiaPagamento {

    @Override
    public void pagar(Compra compra) {
        System.out.println("Conta paga no Débito no valor de R$" + (compra.valor - (compra.valor * 0.10)));
    }

}
