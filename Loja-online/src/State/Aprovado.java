package State;

public class Aprovado implements State {
 
    @Override
    public State Aprovar_Pagamento(){
        System.out.println("O pagamento ja foi aprovado! Aguarde o envio!\n");
        return this;
    }
 
    @Override
    public State Rejeitar_Pagamento(){
        System.out.println("Nao e possivel rejeitar o pagamento pois o mesmo ja foi aprovado! Aguarde o envio!\n");
        return this;
    }
 
    @Override
    public State Aguardar_Pagamento(){
        System.out.println("Nao e possivel aguardar o pagamento pois o mesmo ja foi aprovado! Aguarde o envio!\n");
        return this;
    }
 
    @Override
    public State Entregar(){
        System.out.println("Produto sendo despachado para o cliente!\n");
        return new A_Caminho();
    }
    
    @Override
    public State Reembolsar(){
        System.out.println("Produto Reembolsado!\n");
        return new Reembolsado();
    }
 
}