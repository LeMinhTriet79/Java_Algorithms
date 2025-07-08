package com.vulns.zpayment.testing;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.minhtriet.zpayment.teller.Calculator;
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
   public void sum1(){
        calculator.setA(2);
        calculator.setB(3);
        assertEquals(5, calculator.sum() );
    }
    @Test
    public void sum2(){
        calculator.setA(2);
        calculator.setB(3);
        assertEquals(-1, calculator.sum() );
    }
     @Test
    public void sum3(){
        calculator.setA(0);
        calculator.setB(0);
        assertEquals(0, calculator.sum() );
    }

}
