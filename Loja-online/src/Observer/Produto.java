package Observer;

import java.util.ArrayList;
import java.util.List;

public class Produto implements Observable {
    private List<Observer> observers = new ArrayList();
    private String nome;
    private double valor_antigo;
    private double valor_atual;


    public Produto(String nome, double valor) {
         this.nome = nome;
         this.valor_atual = valor;
    }

       
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor_atual() {
        return valor_atual;
    }

    public void setValor_atual(double valor) {
        valor_antigo = valor_atual;
        this.valor_atual = valor;
        this.notificarObservers();
    }

    public double getValor_antigo() {
        return valor_antigo;
    }
    
    @Override
    public void addObserver(Observer observer) {
         observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
         observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
         for (Observer cliente : observers) {
             System.out.println("Notificando clientes...");
             cliente.atualizar(this);
         }
    }
}