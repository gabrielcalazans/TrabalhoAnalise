package trabalho.pizza.builder;

public class Pizza {
    
    
    private boolean tamanhoP    = false;
    private boolean tamanhoM    = false;
    private boolean tamanhoG    = false;
    private boolean molho       = false;
    private boolean queijo      = false;
    private boolean bacon       = false;
    private boolean calabreza   = false;
    private boolean oregano     = false;

    public void setTamanhoP(boolean tamanhoP) {
        System.out.println("Pizza pequena com:");
    }
    public void setTamanhoM(boolean tamanhoM) {
        System.out.println("Pizza média com:");
    }
    public void setTamanhoG(boolean tamanhoG) {
        System.out.println("Pizza grande com:");
    }
    public void setMolho(boolean molho){
        System.out.println("molho");
        }
    public void setQueijo(boolean queijo){
        System.out.println("queijo");
        }
    public void setBacon(boolean bacon){
        System.out.println("bacon");
        }
    public void setCalabreza(boolean calabreza){
        System.out.println("calabreza");
        }
    public void setOregano(boolean oregano){
        System.out.println("oregano");
        }

    
}
