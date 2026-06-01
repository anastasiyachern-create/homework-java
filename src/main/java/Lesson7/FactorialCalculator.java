package Lesson7;

import java.math.BigInteger;

public class FactorialCalculator {

    public BigInteger factorial(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("Число должно быть >= 0");
        }

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
