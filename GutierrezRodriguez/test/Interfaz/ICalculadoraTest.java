/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import Dominio.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class ICalculadoraTest {

    private ICalculadora instance ;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        instance = new Calculadora();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class ICalculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int i = 1;
        int j = 0;
        int expResult = 1;
        int result = instance.suma(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class ICalculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int i = 1;
        int j = 1;
        int expResult = 0;
        int result = instance.resta(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of producto method, of class ICalculadora.
     */
    @Test
    public void testProducto() {
        System.out.println("producto");
        int i = 1;
        int j = 1;
        int expResult = 1;
        int result = instance.producto(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class ICalculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int i = 0;
        int j = 1;
       
        int expResult = 0;
        int result = instance.division(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

   

}