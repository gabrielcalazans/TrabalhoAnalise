package trabalho.pizza.observable;

public class Tv implements Observador{
    
    @Override
    public void notificar(){
    System.out.println("Notificado pela televisão!!!");
    }
    
}
