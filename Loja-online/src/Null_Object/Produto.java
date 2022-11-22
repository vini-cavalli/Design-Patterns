package Null_Object;

public class Produto {
    
    
    public static String[] produtos = { "Celular", "Telescopio", "Capa para moto"};
    
    
    public static Produto_Abstrato getNome(String nome) {
		for (int i = 0; i < produtos.length; i++) 
			if (produtos[i].equalsIgnoreCase(nome)) 
				return new Produto_Concreto(nome);	
        
                return new Produto_Null();
    }
    
}
