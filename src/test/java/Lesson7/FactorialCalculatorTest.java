package Lesson7;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class FactorialCalculatorTest {
    @Test
    public void testZeroFactorial() {
        FactorialCalculator calculator = new FactorialCalculator();
        BigInteger result = calculator.factorial(0);
        Assert.assertEquals(result, BigInteger.valueOf(1));
    }

    @Test
    public void testFiveFactorial() {
        FactorialCalculator calculator = new FactorialCalculator();
        BigInteger result = calculator.factorial(5);
        Assert.assertEquals(result, BigInteger.valueOf(120));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeFactorial() {
        FactorialCalculator calculator = new FactorialCalculator();
        calculator.factorial(-5);
    }
}
