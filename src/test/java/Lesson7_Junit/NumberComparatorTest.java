package Lesson7_Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberComparatorTest {

    @Test
    @DisplayName("Первое число больше")
    public void testFirstNumberGreater() {

        NumberComparator comparator = new NumberComparator();

        String result = comparator.compare(10, 5);

        Assertions.assertEquals("Первое число больше", result);
    }

    @Test
    @DisplayName("Второе число больше")
    public void testSecondNumberGreater() {

        NumberComparator comparator = new NumberComparator();

        String result = comparator.compare(2, 8);

        Assertions.assertEquals("Второе число больше", result);
    }

    @Test
    @DisplayName("Числа равны")
    public void testEqualNumbers() {

        NumberComparator comparator = new NumberComparator();

        String result = comparator.compare(5, 5);

        Assertions.assertEquals("Числа равны", result);
    }
}