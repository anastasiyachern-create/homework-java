package Lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArithmeticCalculatorTest {

    @Test
    @DisplayName("Тест сложения")
    public void testAdd() {

        ArithmeticCalculator calculator = new ArithmeticCalculator();

        int result = calculator.add(5, 3);

        Assertions.assertEquals(8, result);
    }

    @Test
    @DisplayName("Тест вычитания")
    public void testSubtract() {

        ArithmeticCalculator calculator = new ArithmeticCalculator();

        int result = calculator.subtract(10, 4);

        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("Тест умножения")
    public void testMultiply() {

        ArithmeticCalculator calculator = new ArithmeticCalculator();

        int result = calculator.multiply(5, 2);

        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("Тест деления")
    public void testDivide() {

        ArithmeticCalculator calculator = new ArithmeticCalculator();

        int result = calculator.divide(10, 2);

        Assertions.assertEquals(5, result);
    }

    @Test
    @DisplayName("Тест деления на 0")
    public void testDivideByZero() {

        ArithmeticCalculator calculator = new ArithmeticCalculator();

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(5, 0)
        );
    }
}