package gutierrezrodriguez.dominio.evaluacion;

import gutierrezrodriguez.dominio.Evaluacion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvaluacionEsValidaTest {

    private Evaluacion instancia;

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
        instancia = new Evaluacion();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testEsValida1() {
        System.out.print("Test Evaluacion.esValida 1:      ");
        instancia = new Evaluacion();
        printResults(false, instancia.esValida());
    }

    @Test
    public void testEsValida2() {
        System.out.print("Test Evaluacion.esValida 2:      ");
        instancia = new Evaluacion(8, "Reseña", "Nombre");
        printResults(false, instancia.esValida());
    }

    @Test
    public void testEsValida3() {
        System.out.print("Test Evaluacion.esValida 3:      ");
        instancia = new Evaluacion(4, "Reseña", "Nombre");
        printResults(true, instancia.esValida());
    }
}
