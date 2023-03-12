package com.example.Math.Function;

import static org.junit.jupiter.api.Assertions.*;

class MathFunctionsTest {
    // Test add method
    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(3, MathFunctions.add(1, 2));
        assertEquals(0, MathFunctions.add(0, 0));
        assertEquals(-3, MathFunctions.add(-1, -2));
    }

    // Test subtract method
    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(-1, MathFunctions.subtract(1, 2));
        assertEquals(0, MathFunctions.subtract(0, 0));
        assertEquals(1, MathFunctions.subtract(-1, -2));
    }

    // Test multiply method
    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(2, MathFunctions.multiply(1, 2));
        assertEquals(0, MathFunctions.multiply(0, 0));
        assertEquals(2, MathFunctions.multiply(-1, -2));
    }

    // Test divide method
    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(0, MathFunctions.divide(1, 2));
        assertEquals(0, MathFunctions.divide(-1, -2));
        assertEquals(0, MathFunctions.divide(1, 0));
    }

    // Test remainder method
    @org.junit.jupiter.api.Test
    void remainder() {
        assertEquals(1, MathFunctions.remainder(1, 2));
        assertEquals(1, MathFunctions.remainder(-1, -2));
        assertEquals(0, MathFunctions.remainder(1, 0));
    }

    // Test pow method
    @org.junit.jupiter.api.Test
    void pow() {
        assertEquals(1, MathFunctions.pow(1, 0));
        assertEquals(1, MathFunctions.pow(1, 1));
        assertEquals(1, MathFunctions.pow(1, 2));
        assertEquals(0, MathFunctions.pow(0, 0));
        assertEquals(0, MathFunctions.pow(0, 1));
        assertEquals(0, MathFunctions.pow(0, 2));
        assertEquals(0, MathFunctions.pow(0, -1));
        assertEquals(0, MathFunctions.pow(0, -2));
        assertEquals(1, MathFunctions.pow(-1, 0));
        assertEquals(-1, MathFunctions.pow(-1, 1));
        assertEquals(1, MathFunctions.pow(-1, 2));
        assertEquals(1, MathFunctions.pow(-1, -1));
        assertEquals(-1, MathFunctions.pow(-1, -2));
    }

    // Test sqrt method
    @org.junit.jupiter.api.Test
    void sqrt() {
        assertEquals(1, MathFunctions.sqrt(1));
        assertEquals(0, MathFunctions.sqrt(0));
        assertEquals(0, MathFunctions.sqrt(-1));
    }

    // Test abs method
    @org.junit.jupiter.api.Test
    void abs() {
        assertEquals(1, MathFunctions.abs(1));
        assertEquals(0, MathFunctions.abs(0));
        assertEquals(1, MathFunctions.abs(-1));
    }

    // Test hypotenuse method
    @org.junit.jupiter.api.Test
    void hypotenuse() {
        assertEquals(2.23606797749979, MathFunctions.hypotenuse(1, 2));
        assertEquals(0, MathFunctions.hypotenuse(0, 0));
        assertEquals(2.23606797749979, MathFunctions.hypotenuse(-1, -2));
    }
}