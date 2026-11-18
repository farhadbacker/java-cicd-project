
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private final App calculator = new App();

    @Test
    void testAddition() {
        assertEquals(15.0, calculator.add(10, 5), 0.001);
    }

    @Test
    void testSubtraction() {
        assertEquals(5.0, calculator.subtract(10, 5), 0.001);
    }

    @Test
    void testMultiplication() {
        assertEquals(50.0, calculator.multiply(10, 5), 0.001);
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculator.divide(10, 5), 0.001);
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(10, 0)
        );
    }
}
