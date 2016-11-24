package gutierrezrodriguez;

import gutierrezrodriguez.dominio.*;
import gutierrezrodriguez.interfaz.Frame;

public class Inicio {

    public static void main(String[] args) {   

        Sistema sistema = new Sistema();
        sistema.cargarDatosDePrueba();
        Frame ventana = new Frame(sistema);
        ventana.setVisible(true);
    }
}