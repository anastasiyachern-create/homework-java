package Lesson7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberComparatorTest {
    @Test
    public void testFirstNumberGreater() {
        NumberComparator comparator = new NumberComparator();
        Assert.assertEquals(
                comparator.compare(10, 5),
                "Первое число больше"
        );
    }

    @Test
    public void testSecondNumberGreater() {
        NumberComparator comparator = new NumberComparator();
        Assert.assertEquals(
                comparator.compare(5, 10),
                "Второе число больше"
        );
    }

    @Test
    public void testNumbersAreEqual() {
        NumberComparator comparator = new NumberComparator();
        Assert.assertEquals(
                comparator.compare(7, 7),
                "Числа равны"
        );
    }
}
