package Null_Object;

public class Main {
    public static void main(String args[]) {
    
        Produto_Abstrato p1 = Produto.getNome("cElUlar");
        Produto_Abstrato p2 = Produto.getNome("REloGio");
        Produto_Abstrato p3 = Produto.getNome("Telescopio");
        Produto_Abstrato p4 = Produto.getNome("ceLulaR");
        Produto_Abstrato p5 = Produto.getNome("Capa para moto");
        
        // ---------------------------------------------------- //
        
        System.out.println("Sua lista de produtos pesquisados:\n");
        System.out.println("- " + p1.getNome());
        System.out.println("- " +p2.getNome());
        System.out.println("- " +p3.getNome());
        System.out.println("- " +p4.getNome());
        System.out.println("- " +p5.getNome());
        
    }
    
}
