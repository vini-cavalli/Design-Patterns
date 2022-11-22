package Observer;

class Cliente implements Observer {
    private String nome;
    
    
    public Cliente(String nome){
        this.nome = nome;
    }
    
    @Override
    public void atualizar(Produto produto) {
        // Promoção
        if (produto.getValor_atual() < produto.getValor_antigo()){
            System.out.println("Ola " + this.getNome()
                    + "! O seu produto desejado *"
                    + produto.getNome() 
                    + "* que custava R$" + produto.getValor_antigo() 
                    + " agora esta com um desconto especial, saindo por R$"
                    + produto.getValor_atual());
                System.out.println("Aproveite esta incrivel promocao!\n");
                return;
        }
    
        // Mesmo valor
        if (produto.getValor_atual() == produto.getValor_antigo()){
            System.out.println("Ola " + this.getNome()
                    + "! O seu produto desejado *"
                    + produto.getNome() 
                    + "* permanece no valor de R$"
                    + produto.getValor_atual());
                System.out.println("Experimente outros produtos da nossa loja!\n");
                return;
        }
        
        // Mais caro
        else {
            System.out.println("Ola " + this.getNome()
                    + "! Infelizmente o valor do seu produto desejado *"
                    + produto.getNome() 
                    + "* sofreu um pequeno aumento de R$" + (produto.getValor_atual() - produto.getValor_antigo())
                    + " e agora esta custando R$"
                    + produto.getValor_atual());
                System.out.println("Experimente outros produtos da nossa loja!\n");
                return;
        }
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}