package trabalho.pizza.observable;

public class Celular implements Observador{
    
    @Override
    public void notificar(){
    System.out.println("Notificado pelo celular!!!");
    }
    
}
