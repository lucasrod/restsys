package gutierrezrodriguez.dominio.restaurante;

import gutierrezrodriguez.dominio.Evaluacion;
import gutierrezrodriguez.dominio.Restaurante;
import gutierrezrodriguez.dominio.Sorteo;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestauranteSetSorteoTest {

    private Restaurante instancia;

    //PRE: Recibe el resultado esperado y el resultado real de una prueba.
    //POS: Para las sub-pruebas pinta de verde sii el resultado es correcto.    
    private void printResults(boolean resultadoEsperado, boolean resultado) {
        String inicioDeString = "";
        String finDeString = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        if (resultadoEsperado == resultado) {
            inicioDeString = ANSI_GREEN;
        } else {
            inicioDeString = ANSI_RED;
        }
        System.out.println(inicioDeString
                + "[Expected: " + resultadoEsperado
                + " - Recieved: " + resultado + "]" + finDeString);
        assertEquals(resultadoEsperado, resultado);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instancia = new Restaurante();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSetSorteoPremioNulo() {
        System.out.print("Test Restaurante.setSorteoPremioNulo: ");
        instancia = new Restaurante();
        Sorteo sorteo = new Sorteo(1, "", instancia);
        printResults(false, instancia.setSorteo(sorteo));
    }
    
    @Test
    public void testSetSorteoCorrecto() {
        System.out.print("Test Restaurante.setSorteoCorrecto: ");
        instancia = new Restaurante();
        Sorteo sorteo = new Sorteo(1, "TV Plasma", instancia);
        printResults(true, instancia.setSorteo(sorteo));
    }
    
    @Test
    public void testSetSorteoFueAgregado() {
        System.out.print("Test Restaurante.setSorteoFueAgregado: ");
        instancia = new Restaurante();
        for (int i = 1; i < 11; i++) {
            Evaluacion evaluacion = new Evaluacion(1, "Reseña" + i, "Nombre" + i);
            instancia.setEvaluacion(evaluacion);
        }
        Sorteo sorteo = new Sorteo(1, "TV Plasma", instancia);
        instancia.setSorteo(sorteo);
        printResults(true, instancia.getSorteos().contains(sorteo));
    }
    
    @Test
    public void testSetSorteoCongruenciaDeSorteables(){
        System.out.print("Test Restaurante.setSorteoCongruenciaDeSorteables: ");
        instancia = new Restaurante();
        for (int i = 1; i < 11; i++) {
            Evaluacion evaluacion = new Evaluacion(1, "Reseña" + i, "Nombre" + i);
            instancia.setEvaluacion(evaluacion);
        }
        Sorteo sorteo = new Sorteo(11, "TV Plasma", instancia);
        instancia.setSorteo(sorteo);
        Evaluacion evaluacion = new Evaluacion(1, "Reseña11", "Nombre11");
        instancia.setEvaluacion(evaluacion);
        ArrayList<Evaluacion> todasLasEvaluaciones = instancia.getSorteos().get(0).realizarSorteo();
        printResults(true, todasLasEvaluaciones.contains(evaluacion));
    }
}
