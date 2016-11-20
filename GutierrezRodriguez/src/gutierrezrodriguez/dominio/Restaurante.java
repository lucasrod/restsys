package gutierrezrodriguez.dominio;
import java.util.ArrayList;

public class Restaurante {
    private final ArrayList<Evaluacion> evaluaciones; //falta getter y setter
    private final ArrayList<Evaluacion> evaluacionesSorteables; //falta getter y setter
    private Ficha ficha;

    Restaurante(){
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
    
    public ArrayList<Evaluacion> getEvaluacionesSorteables(){
        return evaluacionesSorteables;
    }
    
    public ArrayList<Evaluacion> getEvaluaciones(){
        return evaluaciones;
    }
    
    public void setEvaluacion(Evaluacion evaluacion){
        evaluaciones.add(evaluacion);
        if(evaluacion.esSorteable()) evaluacionesSorteables.add(evaluacion);
    }
}
