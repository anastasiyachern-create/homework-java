package Lesson7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleAreaCalculatorTest {
    @Test
    public void testTriangleArea() {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        double result = calculator.calculateArea(10, 5);
        Assert.assertEquals(result, 25.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeBase() {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        calculator.calculateArea(-10, 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeHeight() {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        calculator.calculateArea(10, -5);
    }
}
