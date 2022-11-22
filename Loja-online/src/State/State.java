package State;

public interface State {
    State Aprovar_Pagamento();
 
    State Rejeitar_Pagamento();
 
    State Aguardar_Pagamento();
 
    State Entregar();
    
    State Reembolsar();
}
