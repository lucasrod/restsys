package gutierrezrodriguez.dominio;
import java.util.*;

public class Restaurante {
    private ArrayList<Evaluacion> evaluaciones; //falta getter y setter
    private ArrayList<Evaluacion> evaluacionesSorteables; //falta getter y setter
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
}
