package gutierrezrodriguez.dominio;

public class Sistema {
    private Restaurante restaurante;
    
    public Sistema(){
        this.restaurante = new Restaurante();
    }
    
    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
