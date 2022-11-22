package Strategy;

public class PagamentoBoleto implements EstrategiaPagamento {

    @Override
    public void pagar(Compra compra) {
        System.out.println("Conta paga no Boleto no valor de R$" + (compra.valor + (compra.valor * 0.10)));
    }

}
