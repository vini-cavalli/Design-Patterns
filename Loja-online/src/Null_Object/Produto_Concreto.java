package Null_Object;

public class Produto_Concreto extends Produto_Abstrato{

    public Produto_Concreto(String nome){
        this.nome = nome;
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    
}
