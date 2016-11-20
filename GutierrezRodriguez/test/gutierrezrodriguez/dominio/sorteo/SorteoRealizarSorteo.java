package gutierrezrodriguez.dominio.sorteo;

import gutierrezrodriguez.dominio.Evaluacion;
import gutierrezrodriguez.dominio.Restaurante;
import gutierrezrodriguez.dominio.Sorteo;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SorteoRealizarSorteo {
    private Sorteo instancia;
    
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
        instancia = new Sorteo();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testRealizarSorteo1(){
        System.out.print("Test Sorteo.realizarSorteo 1:    ");
        Restaurante restaurante = new Restaurante();
        Evaluacion evaluacion1 = new Evaluacion(1, "Reseña1", "Nombre1");
        Evaluacion evaluacion2 = new Evaluacion(2, "Reseña2", "Nombre2");
        restaurante.setEvaluacion(evaluacion1);
        restaurante.setEvaluacion(evaluacion2);
        instancia = new Sorteo(2, "Ganaste!", restaurante);
        ArrayList<Evaluacion> resultadoSorteo = instancia.realizarSorteo();
        printResults(true, resultadoSorteo.size()==2);
    }
    
    @Test
    public void testRealizarSorteo2(){
        System.out.print("Test Sorteo.realizarSorteo 2:    ");
        Restaurante restaurante = new Restaurante();
        for(int i = 1; i < 11; i++){
            Evaluacion evaluacion = new Evaluacion(1, "Reseña" + i, "Nombre" + i);
            restaurante.setEvaluacion(evaluacion);
        }
        instancia = new Sorteo(10, "Ganaste!", restaurante);
        ArrayList<Evaluacion> resultadoSorteo = instancia.realizarSorteo();
        printResults(true, resultadoSorteo.size()==10);
    }
    
    @Test
    public void testRealizarSorteo3(){
        System.out.print("Test Sorteo.realizarSorteo 3:    ");
        Restaurante restaurante = new Restaurante();
        for(int i = 1; i < 11; i++){
            Evaluacion evaluacion = new Evaluacion(1, "Reseña" + i, "Nombre" + i);
            restaurante.setEvaluacion(evaluacion);
        }
        instancia = new Sorteo(10, "Ganaste!", restaurante);
        boolean esperado = true;
        ArrayList<Evaluacion> resultadoSorteo = instancia.realizarSorteo();
        ArrayList<Evaluacion> recorridos = new ArrayList<Evaluacion>();
        for(int i=0; i<resultadoSorteo.size(); i++){
            esperado &= !recorridos.contains(resultadoSorteo.get(i));
            recorridos.add(resultadoSorteo.get(i));
        }
        printResults(true, esperado);
    }
    
}
