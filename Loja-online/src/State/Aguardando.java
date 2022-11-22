package State;

public class Aguardando implements State {
 
    @Override
    public State Aprovar_Pagamento(){
        System.out.println("O pagamento foi aprovado!\n");
        return new Aprovado();
    }
 
    @Override
    public State Rejeitar_Pagamento(){
        System.out.println("O pagamento foi rejeitado!\n");
        return new Rejeitado();
    }
 
    @Override
    public State Aguardar_Pagamento(){
        System.out.println("O pagamento ja esta em analise!\n");
        return this;
    }
 
    @Override
    public State Entregar(){
        System.out.println("Nao foi possivel despachar! O pagamento ainda esta em analise...\n");
        return this;
    }
    
    @Override
    public State Reembolsar(){
        System.out.println("Nao foi possivel reembolsar! O pagamento ainda esta em analise...\n");
        return this;
    }
 
}
