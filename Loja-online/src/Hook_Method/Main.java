package Hook_Method;

public class Main {
    
    public static void main(String args[]) {
    
        Cliente eduardo = new Cliente_VIP("Eduardo", 100, "");
        Cliente vini = new Cliente_Comum("Vinicius", 100, "");
        
        
        System.out.println("O carrinho de " + eduardo.getNome() + eduardo.getTipo() + " esta custando R$" + eduardo.conta() + "!");
        System.out.println("O carrinho de " + vini.getNome() + vini.getTipo() + " esta custando R$" + vini.conta() + "!");
    }
    
}
