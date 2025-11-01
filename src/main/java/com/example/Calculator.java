package com.example;

public class Calculator {
    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }

    public double multiply(double a, double b) {
        double result = a * b;
       // if (Double.class.isInstance(result)) {
       //     return Math.round(result * 100.0) / 100.0;
       // }
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("division by zero");
        return a / b;
    }
}
