package gutierrezrodriguez.dominio.sorteo;

import gutierrezrodriguez.dominio.Cliente;
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

public class SorteoRealizarSorteoTest {

    private Sorteo instancia;

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
        instancia = new Sorteo();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testRealizarSorteoDosIngresadosDosGanadores() {
        System.out.print("Test Sorteo.realizarSorteoDosIngresadosDosGanadores:      ");
        Restaurante restaurante = new Restaurante();
        Cliente cliente1 = new Cliente("Dato1", "Dato1");
        Evaluacion evaluacion1 = new Evaluacion(1, "Reseña1", cliente1);
        Cliente cliente2 = new Cliente("Dato2", "Dato2");
        Evaluacion evaluacion2 = new Evaluacion(2, "Reseña2", cliente2);
        restaurante.setEvaluacion(evaluacion1);
        restaurante.setEvaluacion(evaluacion2);
        instancia = new Sorteo(2, "Ganaste!", restaurante);
        ArrayList<Cliente> resultadoSorteo = instancia.realizarSorteo();
        printResults(true, resultadoSorteo.size() == 2);
    }

    @Test
    public void testRealizarSorteoDiezIngresadosDiezGanadores() {
        System.out.print("Test Sorteo.realizarSorteoDiezIngresadosDiezGanadores:    ");
        Restaurante restaurante = new Restaurante();
        for (int i = 1; i < 11; i++) {
            Cliente cliente = new Cliente("Dato"+i, "Dato"+i);
            Evaluacion evaluacion = new Evaluacion(1, "Reseña" + i, cliente);
            restaurante.setEvaluacion(evaluacion);
        }
        instancia = new Sorteo(10, "Ganaste!", restaurante);
        ArrayList<Cliente> resultadoSorteo = instancia.realizarSorteo();
        printResults(true, resultadoSorteo.size() == 10);
    }

    @Test
    public void testRealizarSorteoAusenciaDeRepetidos() {
        System.out.print("Test Sorteo.realizarSorteoAusenciaDeRepetido:             ");
        Restaurante restaurante = new Restaurante();
        for (int i = 1; i < 11; i++) {
            Cliente cliente = new Cliente("Dato"+i, "Dato"+i);
            Evaluacion evaluacion = new Evaluacion(1, "Reseña" + i, cliente);
            restaurante.setEvaluacion(evaluacion);
        }
        instancia = new Sorteo(10, "Ganaste!", restaurante);
        boolean resultado = true;
        ArrayList<Cliente> resultadoSorteo = instancia.realizarSorteo();
        ArrayList<Cliente> recorridos = new ArrayList<Cliente>();
        for (int i = 0; i < resultadoSorteo.size(); i++) {
            resultado &= !recorridos.contains(resultadoSorteo.get(i));
            recorridos.add(resultadoSorteo.get(i));
        }
        printResults(true, resultado);
    }

    @Test
    public void testRealizarSorteoCambioDeOrden() {
        System.out.print("Test Sorteo.realizarSorteoCambioDeOrden:                  ");
        Restaurante restaurante = new Restaurante();
        for (int i = 1; i < 11; i++) {
            Cliente cliente = new Cliente("Dato"+i, "Dato"+i);
            Evaluacion evaluacion = new Evaluacion(1, "Reseña" + i, cliente);
            restaurante.setEvaluacion(evaluacion);
        }
        instancia = new Sorteo(10, "Ganaste!", restaurante);
        boolean resultado = false;
        ArrayList<Cliente> resultadoSorteo = instancia.realizarSorteo();
        ArrayList<Evaluacion> evaluacionesSorteables = restaurante.getEvaluacionesSorteables();
        for (int i = 0; i < resultadoSorteo.size(); i++) {
            resultado |= !resultadoSorteo.get(i).equals(evaluacionesSorteables.get(i).getCliente());
        }
        printResults(true, resultado);
    }

    @Test
    public void testRealizarSorteoMasGanadoresQueEvaluaciones() {
        System.out.print("Test Sorteo.realizarSorteoMasGanadoresQueEvaluaciones:    ");
        Restaurante restaurante = new Restaurante();
        for (int i = 1; i < 11; i++) {
            Cliente cliente = new Cliente("Dato"+i, "Dato"+i);
            Evaluacion evaluacion = new Evaluacion(1, "Reseña" + i, cliente);
            restaurante.setEvaluacion(evaluacion);
        }
        instancia = new Sorteo(15, "Ganaste!", restaurante);
        ArrayList<Cliente> resultadoSorteo = instancia.realizarSorteo();
        printResults(true, resultadoSorteo.size() == 10);
    }

    @Test
    public void testRealizarSorteoMenosGanadoresQueEvaluaciones() {
        System.out.print("Test Sorteo.realizarSorteoMenosGanadoresQueEvaluaciones:  ");
        Restaurante restaurante = new Restaurante();
        for (int i = 1; i < 11; i++) {
            Cliente cliente = new Cliente("Dato"+i, "Dato"+i);
            Evaluacion evaluacion = new Evaluacion(1, "Reseña" + i, cliente);
            restaurante.setEvaluacion(evaluacion);
        }
        instancia = new Sorteo(3, "Ganaste!", restaurante);
        ArrayList<Cliente> resultadoSorteo = instancia.realizarSorteo();
        printResults(true, resultadoSorteo.size() == 3);
    }
    
    @Test
    public void testRealizarSorteoNoExistenEvaluaciones(){
        System.out.print("Test Sorteo.realizarSorteoNoExistenEvaluaciones:          ");
        Restaurante restaurante = new Restaurante();
        instancia = new Sorteo(3, "Ganaste!", restaurante);
        ArrayList<Cliente> resultadoSorteo = instancia.realizarSorteo();
        printResults(true, resultadoSorteo.isEmpty());
    }
    
    @Test
    public void testRealizarSorteoPreviamenteRealizado(){
        System.out.print("Test Sorteo.realizarSorteoPreviamenteRealizado:           ");
        Restaurante restaurante = new Restaurante();
        for (int i = 1; i < 11; i++) {
            Cliente cliente = new Cliente("Dato"+i, "Dato"+i);
            Evaluacion evaluacion = new Evaluacion(1, "Reseña" + i, cliente);
            restaurante.setEvaluacion(evaluacion);
        }
        instancia = new Sorteo(3, "Ganaste!", restaurante);
        instancia.realizarSorteo();
        printResults(true, instancia.isRealizado());        
    }
    
    @Test
    public void testRealizarSorteoPreviamenteRealizadoRetorno(){
        System.out.print("Test Sorteo.realizarSorteoPreviamenteRealizadoRetorno:    ");
        Restaurante restaurante = new Restaurante();
        for (int i = 1; i < 11; i++) {
            Cliente cliente = new Cliente("Dato"+i, "Dato"+i);
            Evaluacion evaluacion = new Evaluacion(1, "Reseña" + i, cliente);
            restaurante.setEvaluacion(evaluacion);
        }
        instancia = new Sorteo(3, "Ganaste!", restaurante);
        instancia.realizarSorteo();
        ArrayList<Cliente> ganadoresPrueba = instancia.realizarSorteo();
        printResults(true, ganadoresPrueba.isEmpty());        
    }
    
}