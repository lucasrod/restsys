package gutierrezrodriguez;

import gutierrezrodriguez.dominio.*;
import gutierrezrodriguez.interfaz.Frame;
import java.util.ArrayList;

public class Inicio {

    public static void main(String[] args) {   

        Sistema sistema = new Sistema();
        Frame ventana = new Frame(sistema);
        ventana.setVisible(true);
    }
}