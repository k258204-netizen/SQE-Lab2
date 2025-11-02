package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAdd() { assertEquals(5.0, calc.add(2, 3)); }

    @Test
    public void testSubtract() { assertEquals(3.0, calc.subtract(5, 2)); }

    @Test
    public void testMultiplyIntegers() { assertEquals(12.345, calc.multiply(4.115, 3)); }

    

    @Test
    public void testMultiplyFloats() {
        double res = calc.multiply(0.1, 0.2);
        assertEquals(0.020000000000000004, res, 1e-12);
    }

    @Test
    public void testDivide() { assertEquals(1.0/3.0, calc.divide(1, 3)); }

    @Test
    public void testDivideByZero() { assertThrows(ArithmeticException.class, () -> calc.divide(1, 0)); }


    @Test
void testMultiplyHighPrecision_double() {
Calculator calc = new Calculator();
// double version isn't exact → will fail
assertEquals(0.03, calc.multiply(0.1, 0.3),
0.0000000000000001, "double multiply should be 0.03");
}
@Test
void testMultiplyHighPrecision_BigDecimal() {
Calculator calc = new Calculator();
// correct result expectation is 0.03 EXACTLY
assertEquals(0.03, calc.multiply(0.1, 0.3),
0.0, "BigDecimal multiply should be exact 0.03");
}
}
