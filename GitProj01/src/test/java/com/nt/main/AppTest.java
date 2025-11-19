package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSumWithPositive() {
        App app=new App();
        int expected=30;
        int actual=app.sum(10, 20);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testSumWithNegative() {
        App app=new App();
        int expected=-30;
        int actual=app.sum(-10,-20);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testSumWithMixedValues() {
        App app=new App();
        int expected=10;
        int actual=app.sum(-10,+20);
        assertEquals(expected,actual);
    }


}
