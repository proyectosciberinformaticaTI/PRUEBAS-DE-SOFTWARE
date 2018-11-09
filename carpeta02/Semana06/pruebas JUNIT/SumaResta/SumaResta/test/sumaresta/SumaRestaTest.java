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
 * @author SUITE
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

    /**
     * Test of validarA method, of class SumaResta.
     */
    @Test
    public void testValidarA() {
        System.out.println("validarA con dato correcto");
        SumaResta instance = new SumaResta(450, 50, 1);
        boolean expResult = true;
        boolean result = instance.validarA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of validarB method, of class SumaResta.
     */
    @Test
    public void testValidarB() {
        System.out.println("validarB con dato correcto");
        SumaResta instance = new SumaResta(450, 5, 1);
        boolean expResult = true;
        boolean result = instance.validarB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of obtenerResultado method, of class SumaResta.
     */
    @Test
    public void testObtenerResultado() {
        System.out.println("obtenerResultado con datos verdaderos");
        SumaResta instance = new SumaResta(450, 50, 1);
        String expResult = "La suma es: 500";
        String result = instance.obtenerResultado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
