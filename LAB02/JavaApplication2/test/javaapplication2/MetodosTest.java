/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SUITE
 */
public class MetodosTest {
    
    public MetodosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validarfechita method, of class Metodos.
     */
    /*@Test
    public void testValidarfechita() {
        System.out.println("validarfechita");
        String patronsd = "";
        Metodos instance = new Metodos("23:45");
        boolean expResult = false;
        boolean result = instance.validarfechita(patronsd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
*/
    /**
     * Test of calcularmontopagar method, of class Metodos.
     */
    @Test
    public void testCalcularmontopagarantesdelas22() throws Exception {
        System.out.println("calcularmontopagar");
        Metodos instance = new Metodos("21:45");
        String expResult = "paga el 70% del monto de 50 soles";
        String result = instance.calcularmontopagar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalcularmontopagarantesdelas23() throws Exception {
        System.out.println("calcularmontopagar");
        Metodos instance = new Metodos("22:45");
        String expResult = "paga el 90% del monto de 50 soles";
        String result = instance.calcularmontopagar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCalcularmontopagardespuesdelamedianoche() throws Exception {
        System.out.println("calcularmontopagar");
        Metodos instance = new Metodos("03:45");
        String expResult = "para el 100% del monto de 50 soles";
        String result = instance.calcularmontopagar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCalcularmontopagarentrelas23ymedianochoe() throws Exception {
        System.out.println("calcularmontopagar");
        Metodos instance = new Metodos("23:45");
        String expResult = "en este horario no hay descuento";
        String result = instance.calcularmontopagar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCalcularmontopagarentrelasdehorainvalido() throws Exception {
        System.out.println("calcularmontopagar");
        Metodos instance = new Metodos("48:45");
        String expResult = "no es una hora valida";
        String result = instance.calcularmontopagar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
    
    
}
