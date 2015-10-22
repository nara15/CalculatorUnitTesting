package calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonaranjo
 */
public class SumRestTest {
    
    public SumRestTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void testSumaPass()
    {
        assertEquals("Error en sumar()", 3, Calculadora.sumar(1,2));
        assertEquals("Error en sumar()", 75, Calculadora.sumar(63,12));
        assertEquals("Error en sumar()", 100, Calculadora.sumar(50,50));
    }
    
    @Test
    public void testSumaFallo()
    {
        assertEquals("Error en sumar()", 45, Calculadora.sumar(1, 2));
        assertEquals("Error en sumar()", 1, Calculadora.sumar(100, 21));
    }
    
    @Test
    public void testRestaPass()
    {
        assertEquals("error in restar()",  1, Calculadora.restar(2, 1));
        assertEquals("error in restar()", -1, Calculadora.restar(-2, -1));
        assertEquals("error in restar()",  0, Calculadora.restar(2, 2));
    }
    
    @Test
    public void testRestaFallo()
    {
        assertEquals("error in restar()",  1, Calculadora.restar(2, 2));
    }
}
