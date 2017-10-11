package trabalho.pizza.template;

public abstract class ComerPizza {
    
    public void gerarComerPizza(){
        tamanho();
        ingredientes();
        comer();
        
    }
    private void tamanho(){
        System.out.println("Já escolhi o tamanho!!!");
    }
    private void ingredientes(){
        System.out.println("Já escolhi os ingredientes!!!");
        }
    protected abstract void comer();
    
}
