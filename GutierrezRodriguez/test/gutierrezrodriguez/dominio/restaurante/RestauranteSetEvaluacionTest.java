package gutierrezrodriguez.dominio.restaurante;

import gutierrezrodriguez.dominio.Cliente;
import gutierrezrodriguez.dominio.Evaluacion;
import gutierrezrodriguez.dominio.Restaurante;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestauranteSetEvaluacionTest {

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
    public void testSetEvaluacionEvaluacionNoValidaNula() {
        System.out.print("Test Restaurante.setEvaluacionNoValidaNula:               ");
        instancia = new Restaurante();
        Evaluacion evaluacion = new Evaluacion();
        printResults(false, instancia.setEvaluacion(evaluacion));
    }

    @Test
    public void testSetEvaluacionCorrecto() {
        System.out.print("Test Restaurante.setEvaluacionCorrecto:                   ");
        instancia = new Restaurante();
        Cliente cliente = new Cliente();
        Evaluacion evaluacion = new Evaluacion(4, "", cliente);
        instancia.setEvaluacion(evaluacion);
        ArrayList<Evaluacion> evaluaciones = instancia.getEvaluaciones();
        printResults(true, evaluaciones.contains(evaluacion));
    }

    @Test
    public void testSetEvaluacionNoSorteable() {
        System.out.print("Test Restaurante.setEvaluacionNoSorteable:                ");
        instancia = new Restaurante();
        Cliente cliente = new Cliente();
        Evaluacion evaluacion = new Evaluacion(4, "", cliente);
        instancia.setEvaluacion(evaluacion);
        ArrayList<Evaluacion> evaluaciones = instancia.getEvaluacionesSorteables();
        printResults(false, evaluaciones.contains(evaluacion));
    }

}
