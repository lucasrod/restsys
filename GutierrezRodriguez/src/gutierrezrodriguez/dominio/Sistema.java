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
            Evaluacion evaluacion = new Evaluacion(1, "Reseña " + i, new Cliente("Juan Pedro " + i, "jotape_" + i + "@gmail.com"));
            restaurante.setEvaluacion(evaluacion);
        }
        for(int i=1; i<=50; i++){
            Sorteo sorteo = new Sorteo(i, "Premio"+i, restaurante);
            restaurante.setSorteo(sorteo);
        }
        Ficha ficha = new Ficha("Dakota", "21 de Setiembre esq. Luis de La Torre");
        restaurante.setFicha(ficha);
    }
}
