package gutierrezrodriguez.dominio;

import java.util.ArrayList;

public class Restaurante {

    private final ArrayList<Evaluacion> evaluaciones;
    private final ArrayList<Evaluacion> evaluacionesSorteables;
    private Ficha ficha;

    public Restaurante() {
        this.evaluaciones = new ArrayList<Evaluacion>();
        this.evaluacionesSorteables = new ArrayList<Evaluacion>();
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
