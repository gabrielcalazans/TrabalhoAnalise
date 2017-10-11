package trabalho.pizza.observable;

import java.util.ArrayList;
import java.util.List;

public class Forno {
    private static Forno temperatura = new Forno();
    private float temp;
    private List<Observador> observadores = new ArrayList<>();
    
    private Forno(){}
    
    public static Forno getTemperatura(){
        if(temperatura == null)
            temperatura = new Forno();
        return temperatura;
    }
    public void setTemp(float novo){
        temp = novo;
        notificaTodos();
    }
    public void addObservador(Observador novo){
        observadores.add(novo);
    }
    private void notificaTodos(){
        if(temp != 180)
            System.out.println("A temperatura NÃO ESTÁ CORRETA!!!");
        else
            System.out.println("A temperatura está correta");
        
        for(Observador observador:observadores)
            observador.notificar();
    }
    
}
