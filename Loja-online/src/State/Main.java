package State;

public class Main {

    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        
        //System.out.println(p1.estado);
        
        p1.Aprovar_Pagamento();
        
        //System.out.println(p1.estado);
        
        p1.Aprovar_Pagamento();
        p1.Rejeitar_Pagamento();
        p1.Aguardar_Pagamento();
        
    }

}
