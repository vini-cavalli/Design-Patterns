package Strategy;

public class PagamentoCredito implements EstrategiaPagamento {

    @Override
    public void pagar(Compra compra) {
        System.out.println("Conta paga no Crédito no valor de R$" + compra.valor);
    }

}
