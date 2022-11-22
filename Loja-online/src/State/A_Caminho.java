package State;

public class A_Caminho implements State {
 
    @Override
    public State Aprovar_Pagamento(){
        System.out.println("O produto ja esta a caminho! O pagamento foi aprovado ha muito tempo...\n");
        return this;
    }
 
    @Override
    public State Rejeitar_Pagamento(){
        System.out.println("O produto ja esta a caminho! Nao e possivel rejeitar o pagamento...\n");
        return this;
    }
 
    @Override
    public State Aguardar_Pagamento(){
        System.out.println("O produto ja esta a caminho! Nao ha o que aguardar...\n");
        return this;
    }
 
    @Override
    public State Entregar(){
        System.out.println("O produto ja esta a caminho! Aguarde mais um pouco...\n");
        return this;
    }
    
    @Override
    public State Reembolsar(){
        System.out.println("O pacote esta retornando para a loja e o dinheiro para a carteira do cliente!\n");
        return new Reembolsado();
    }
    
}

