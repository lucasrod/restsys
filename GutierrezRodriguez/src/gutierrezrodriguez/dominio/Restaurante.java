package gutierrezrodriguez.dominio;

import java.util.ArrayList;

public class Restaurante {

    private final ArrayList<Evaluacion> evaluaciones;
    private final ArrayList<Evaluacion> evaluacionesSorteables;
    private final ArrayList<Sorteo> sorteos;
    private Ficha ficha;

    public Restaurante() {
        this.evaluaciones = new ArrayList<>();
        this.evaluacionesSorteables = new ArrayList<>();
        this.sorteos = new ArrayList<>();
        this.ficha = new Ficha();
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public ArrayList<Evaluacion> getEvaluacionesSorteables() {
        return evaluacionesSorteables;
    }

    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }
    
    public ArrayList<Sorteo> getSorteos(){
        return this.sorteos;
    }
    
    //PRE: El sorteo debe tener premio.
    //POS: Retorna true sii el sorteo tiene premio y fue agregado a la lista de sorteos.
    public boolean setSorteo(Sorteo sorteo){
        boolean retorno = false;
        if(!sorteo.getPremio().isEmpty()){
            this.sorteos.add(sorteo);
            retorno = true;
        }
        return retorno;
    }

    //PRE:  -
    //POS:  (Ingresa la evaluacion y retorna true) sii es valida
    public boolean setEvaluacion(Evaluacion evaluacion) {
        if (evaluacion.esValida()) {
            evaluaciones.add(evaluacion);
            if (evaluacion.esSorteable()) {
                evaluacionesSorteables.add(evaluacion);
            }
        }
        return evaluacion.esValida();
    }
}
