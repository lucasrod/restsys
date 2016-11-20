package gutierrezrodriguez.dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvaluacionTest {
    
    private Evaluacion instancia;
    
    private void printSeparator(){
        System.out.println("-----------------------------------------------------------");
    }
    
    //PRE: Recibe el resultado esperado y el resultado real de una prueba.
    //POS: Para las sub-pruebas pinta de verde sii el resultado es correcto.    
    private void printResults(boolean resultadoEsperado, boolean resultado){
        String inicioDeString = "";
        String finDeString = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        if(resultadoEsperado == resultado)  inicioDeString = ANSI_GREEN;
        else                                inicioDeString = ANSI_RED;
        System.out.println(inicioDeString + 
                "[Expected: " + resultadoEsperado + 
                " - Recieved: " + resultado + "]" + finDeString);
        assertEquals(resultadoEsperado, resultado);
    }
    
    private void testSetEstrellas1(){
        System.out.print("Test setEstrellas 1:  ");
        int estrellas = 3;
        printResults(true, instancia.setEstrellas(estrellas));
    }
    
    private void testSetEstrellas2(){
        System.out.print("Test setEstrellas 2:  ");
        int estrellas = 8;
        printResults(false, instancia.setEstrellas(estrellas));
    }
    
    private void testSetEstrellas3(){
        System.out.print("Test setEstrellas 3:  ");
        int estrellas = -5;
        printResults(false, instancia.setEstrellas(estrellas));
    }
    
    private void testEsSorteable1(){
        System.out.print("Test esSorteable 1:   ");
        instancia = new Evaluacion(3, "Reseña", "Nombre");
        printResults(true, instancia.esSorteable());
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
    public void testSetEstrellas() {
       testSetEstrellas1();
       testSetEstrellas2();
       testSetEstrellas3();
       printSeparator();
    }
    
    @Test
    public void testEsSorteable(){
        testEsSorteable1();
        printSeparator();
    }
}
