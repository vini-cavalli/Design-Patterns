package Observer;

public class Main {
    public static void main(String args[]) {
        
        // Clientes
        Cliente Eduardo = new Cliente("Eduardo");
        Cliente Vinicius = new Cliente("Vinicius");
        Cliente Lucas = new Cliente("Lucas");
        
        
        // ---------------------------------------------
        
        // Produtos
        Produto celular = new Produto("Celular", 2000);
        Produto telescopio = new Produto("Telescopio", 2500);
        Produto capa_moto = new Produto("Capa para moto", 350);
        
        
        // ---------------------------------------------
        
        // Observando
        celular.addObserver(Eduardo);
        telescopio.addObserver(Vinicius);
        celular.addObserver(Vinicius);
        capa_moto.addObserver(Lucas);
        
        
        // ---------------------------------------------
        
        // Valores Atualizados
        celular.setValor_atual(1500);
        telescopio.setValor_atual(2500);
        //capa_moto.setValor_atual(360);
    }
}
