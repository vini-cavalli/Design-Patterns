package Null_Object;

public class Produto_Null extends Produto_Abstrato{

    @Override
    public String getNome() {
        return "Produto indisponivel!";
    }
    
}
