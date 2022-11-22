package State;

public class Rejeitado implements State {
 
    @Override
    public State Aprovar_Pagamento(){
        System.out.println("Nao foi possivel aprovar o pagamento pois o mesmo acaba de ser rejeitado!\n");
        return this;
    }
 
    @Override
    public State Rejeitar_Pagamento(){
        System.out.println("Este pagamento já foi rejeitado!\n");
        return this;
    }
 
    @Override
    public State Aguardar_Pagamento(){
        System.out.println("O pagamento foi enviado novamente para analise!\n");
        return new Aguardando();
    }
 
    @Override
    public State Entregar(){
        System.out.println("Nao e possivel despachar o produto com o pagamento rejeitado!\n");
        return this;
    }
    
    @Override
    public State Reembolsar(){
        System.out.println("O pagamento foi rejeitado! Nao ha o que reembolsar...\n");
        return this;
    }
 
}
