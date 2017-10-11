package trabalho.pizza.builder;

public class PizzaBuilder {
    
    private Pizza pizza;

    public PizzaBuilder criaPizza(){
        pizza = new Pizza();
        return this;
    }
    public PizzaBuilder tamanhoPequeno(){
        pizza.setTamanhoP(true);
        return this;
    }
    public PizzaBuilder tamanhoMedio(){
        pizza.setTamanhoM(true);
        return this;
    }
    public PizzaBuilder tamanhoGrade(){
        pizza.setTamanhoG(true);
        return this;
    }
    public PizzaBuilder molho( ){
        pizza.setMolho(true);
        return this;
    }
    public PizzaBuilder queijo( ){
        pizza.setQueijo(true);
        return this;
    }
    public PizzaBuilder bacon( ){
        pizza.setBacon(true);
        return this;
    }
    public PizzaBuilder calabreza( ){
        pizza.setCalabreza(true);
        return this;
    }
    
    public Pizza build(){
        return this.pizza;
    }
    
    
}
