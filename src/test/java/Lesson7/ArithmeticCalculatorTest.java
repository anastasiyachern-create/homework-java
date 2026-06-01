package Lesson7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticCalculatorTest {
    @Test
    public void testAddition() {
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        Assert.assertEquals(calculator.add(2, 3), 5);
    }

    @Test
    public void testSubtraction() {
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        Assert.assertEquals(calculator.subtract(10, 4), 6);
    }

    @Test
    public void testMultiplication() {
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        Assert.assertEquals(calculator.multiply(3, 5), 15);
    }

    @Test
    public void testDivision() {
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        Assert.assertEquals(calculator.divide(10, 2), 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivisionByZero() {
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        calculator.divide(10, 0);
    }
}
