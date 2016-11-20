package gutierrezrodriguez.dominio;
import java.util.*;

public class Restaurante {
    private ArrayList<Evaluacion> evaluaciones; //falta getter y setter
    private ArrayList<Evaluacion> evaluacionesSorteables; //falta getter y setter
    private Ficha ficha; //falta getter y setter
    
    Restaurante(){
        this.evaluaciones = new ArrayList<Evaluacion>();
        this.evaluacionesSorteables = new ArrayList<Evaluacion>();
        this.ficha = new Ficha();
    }
}
