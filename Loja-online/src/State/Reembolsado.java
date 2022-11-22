package State;

public class Reembolsado implements State {
 
    @Override
    public State Aprovar_Pagamento(){
        System.out.println("\nNao e mais possivel aprovar o pagamento! A compra foi reembolsada...\n");
        return this;
    }
 
    @Override
    public State Rejeitar_Pagamento(){
        System.out.println("\nNao e mais possivel rejeitar o pagamento! A compra foi reembolsada...\n");
        return this;
    }
 
    @Override
    public State Aguardar_Pagamento(){
        System.out.println("\nNao e mais possivel aguardar o pagamento! A compra foi reembolsada...\n");
        return this;
    }
 
    @Override
    public State Entregar(){
        System.out.println("\nNao e possivel entregar uma compra reembolsada!\n");
        return this;
    }
    
    @Override
    public State Reembolsar(){
        System.out.println("\nEssa compra ja foi reembolsada\n");
        return this;
    }
 
}
