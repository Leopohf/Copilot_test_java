package com.example.Math.Function;

public class MathFunctions {

    // Returns the addition of two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Returns the subtraction of two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Returns the multiplication of two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Returns the division of two numbers
    public static int divide(int a, int b) {
        return a / b;
    }

    // Returns the remainder of two numbers
    public static int remainder(int a, int b) {
        return a % b;
    }

    // Returns the power of a number
    public static double pow(int a, int b) {
        return Math.pow(a, b);
    }

    // Returns the square root of a number
    public static double sqrt(int a) {
        return Math.sqrt(a);
    }

    // Returns the absolute value of a number
    public static int abs(int a) {
        return Math.abs(a);
    }

    // Returns the hypotenuse of a right triangle
    public static double hypotenuse(int a, int b) {
        return Math.hypot(a, b);
    }
}
