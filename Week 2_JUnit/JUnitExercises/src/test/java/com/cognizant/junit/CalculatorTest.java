package com.cognizant.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(10, c.add(5, 5));
    }

    @Test
    public void testSubtract() {
        Calculator c = new Calculator();
        assertEquals(5, c.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        Calculator c = new Calculator();
        assertEquals(50, c.multiply(10, 5));
    }
}