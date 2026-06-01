package Lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleAreaCalculatorTest {

    @Test
    @DisplayName("Тест площади треугольника")
    public void testTriangleArea() {

        TriangleAreaCalculator calculator = new TriangleAreaCalculator();

        double result = calculator.calculateArea(10, 4);

        Assertions.assertEquals(20, result);
    }

    @Test
    @DisplayName("Тест отрицательных значений")
    public void testNegativeValues() {

        TriangleAreaCalculator calculator = new TriangleAreaCalculator();

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.calculateArea(-1, 5)
        );
    }
}