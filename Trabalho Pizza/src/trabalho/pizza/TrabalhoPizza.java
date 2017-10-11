package trabalho.pizza;

import trabalho.pizza.builder.*;
import trabalho.pizza.observable.*;
import trabalho.pizza.template.*;

public class TrabalhoPizza {

    public static void main(String[] args) {
        
        
        PizzaBuilder pz = new PizzaBuilder();
        
        
        Pizza p = pz.criaPizza()
                .tamanhoPequeno()
                .bacon()
                .calabreza()
                .molho()
                .build();
        ComerPizza c = new Casa();
        c.gerarComerPizza();        
        Forno f = Forno.getTemperatura();
        f.addObservador(new Celular());
        f.addObservador(new Tv());
        f.setTemp(181);
}
    
}
