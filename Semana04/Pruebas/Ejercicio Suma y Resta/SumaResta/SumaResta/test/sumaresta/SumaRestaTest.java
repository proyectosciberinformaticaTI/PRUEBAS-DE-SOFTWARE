/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaresta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TITO
 */
public class SumaRestaTest {
    
    public SumaRestaTest() {
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

    //CASO DE PRUEBA 1
    //****************
    
    /**
     * Test of validarA method, of class SumaResta.
     */
    @Test
    public void testValidarACaso1() {
        System.out.println("validarA");
        SumaResta instance = new SumaResta(708, 43, 1);
        boolean expResult = true;
        boolean result = instance.validarA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validarB method, of class SumaResta.
     */
    @Test
    public void testValidarBCaso1() {
        System.out.println("validarA");
        SumaResta instance = new SumaResta(708, 43, 1);
        boolean expResult = true;
        boolean result = instance.validarB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerResultado method, of class SumaResta.
     */
    @Test
    public void testObtenerResultadoCaso1() {
        System.out.println("obtenerResultado");
        SumaResta instance = new SumaResta(708, 43, 1);
        String expResult = "La suma es: 751";
        String result = instance.obtenerResultado();
         assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //CASO DE PRUEBA 2
    //****************
    
    /**
     * Test of validarA method, of class SumaResta.
     */
    @Test
    public void testValidarACaso2() {
        System.out.println("validarA");
        SumaResta instance = new SumaResta(708, 43, 2);
        boolean expResult = true;
        boolean result = instance.validarA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validarB method, of class SumaResta.
     */
    @Test
    public void testValidarBCaso2() {
        System.out.println("validarA");
        SumaResta instance = new SumaResta(708, 43, 2);
        boolean expResult = true;
        boolean result = instance.validarB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerResultado method, of class SumaResta.
     */
    @Test
    public void testObtenerResultadoCaso2() {
        System.out.println("obtenerResultado");
        SumaResta instance = new SumaResta(708, 43, 2);
        String expResult = "La resta es: 665";
        String result = instance.obtenerResultado();
         assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
