package State;

public class Produto {
    protected State estado;
     
    public Produto() {
        estado = new Aguardando();
    }
 
    public void Aprovar_Pagamento() {
        estado = estado.Aprovar_Pagamento();
    }
 
    public void Rejeitar_Pagamento() {
        estado = estado.Rejeitar_Pagamento();
    }
 
    public void Aguardar_Pagamento() {
        estado = estado.Aguardar_Pagamento();
    }
 
    public void Entregar() {
        estado = estado.Entregar();
    }
    
    public void Reembolsar() {
        estado = estado.Reembolsar();
    }
}