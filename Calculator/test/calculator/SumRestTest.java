package calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    public void TestSumPass()
    {
        assertEquals("Error en sumar()", 3, Calculadora.sumar(1,2));
    }
    
    @Test
    public void TestSumFallo()
    {
        assertEquals("Error en sumar()", 45, Calculadora.sumar(1, 2));
    }
}
