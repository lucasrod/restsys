package gutierrezrodriguez.dominio.ficha;

import gutierrezrodriguez.dominio.Evaluacion;
import gutierrezrodriguez.dominio.Ficha;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FichaSetHorarioTest {
    private Ficha instancia;
    
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

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instancia = new Ficha();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testSetHorario1(){
       System.out.print("Test Ficha.setHorario 1:         ");
       instancia = new Ficha();
       printResults(false, instancia.setHorario(8, "Desde las 10hs hasta las 15hs"));
    }
    
    @Test
    public void testSetHorario2(){
       System.out.print("Test Ficha.setHorario 2:         ");
       instancia = new Ficha();
       printResults(true, instancia.setHorario(4, "Desde las 10hs hasta las 15hs"));
    }
    
    @Test
    public void testSetHorario3(){
       System.out.print("Test Ficha.setHorario 3:         ");
       instancia = new Ficha();
       printResults(false, instancia.setHorario(-85, "Desde las 10hs hasta las 15hs"));
    }
}
