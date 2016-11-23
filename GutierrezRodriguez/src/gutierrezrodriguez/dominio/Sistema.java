package gutierrezrodriguez.dominio;

public class Sistema {

    private Restaurante restaurante;

    public Sistema() {
        this.restaurante = new Restaurante();
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
    
    public void cargarDatosDePrueba(){
        for (int i = 1; i <= 50; i++) {
            Evaluacion evaluacion = new Evaluacion(1, "Reseña" + i, "Nombre" + i);
            restaurante.setEvaluacion(evaluacion);
        }
    }
}
