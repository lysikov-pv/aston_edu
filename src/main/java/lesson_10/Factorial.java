package lesson_10;

import java.math.BigInteger;

public class Factorial {
    /**
     * Возвращает факториал числа n (n!)
     * @param n входной параметр
     * @return факториал числа n. Для n<0 возращает null.
     */
    public static BigInteger get(int n) {
        BigInteger result = n >= 0 ? BigInteger.ONE : null;
        for (int i = 1; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
