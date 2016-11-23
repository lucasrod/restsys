package gutierrezrodriguez;

import gutierrezrodriguez.dominio.*;
import gutierrezrodriguez.interfaz.Frame;
import java.util.ArrayList;

public class Inicio {

    public static void main(String[] args) {
        
        System.out.print("Test Restaurante.setSorteoFueAgregado: ");
        Restaurante instancia = new Restaurante();
        for (int i = 1; i < 11; i++) {
            Evaluacion evaluacion = new Evaluacion(1, "Reseña" + i, "Nombre" + i);
            instancia.setEvaluacion(evaluacion);
        }
        Sorteo sorteo = new Sorteo(11, "TV Plasma", instancia);
        instancia.setSorteo(sorteo);
        Evaluacion evaluacion = new Evaluacion(1, "Reseña11", "Nombre11");
        instancia.setEvaluacion(evaluacion);
        ArrayList<Evaluacion> todasLasEvaluaciones = instancia.getSorteos().get(0).realizarSorteo();
        boolean a =  todasLasEvaluaciones.contains(sorteo);
        
        
        
        
        Sistema sistema = new Sistema();
        Frame ventana = new Frame(sistema);
        ventana.setVisible(true);
    }
}