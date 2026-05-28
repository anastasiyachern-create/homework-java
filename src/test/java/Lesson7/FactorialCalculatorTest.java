package Lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class FactorialCalculatorTest {

    @Test
    @DisplayName("Тест факториала нуля")
    public void testZeroFactorial() {

        FactorialCalculator calculator = new FactorialCalculator();

        BigInteger result = calculator.factorial(0);

        Assertions.assertEquals(BigInteger.valueOf(1), result);
    }

    @Test
    @DisplayName("Тест факториала пяти")
    public void testFiveFactorial() {

        FactorialCalculator calculator = new FactorialCalculator();

        BigInteger result = calculator.factorial(5);

        Assertions.assertEquals(BigInteger.valueOf(120), result);
    }

    @Test
    @DisplayName("Тест отрицательного числа")
    public void testNegativeFactorial() {

        FactorialCalculator calculator = new FactorialCalculator();

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.factorial(-5)
        );
    }
}
