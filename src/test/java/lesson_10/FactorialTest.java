package lesson_10;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class FactorialTest {
    @Test
    void zero() {
        Assert.assertEquals(BigInteger.valueOf(1), Factorial.get(0));
    }
    @Test
    void naturalInt() {
        Assert.assertEquals(BigInteger.valueOf(1), Factorial.get(1));
        Assert.assertEquals(BigInteger.valueOf(2), Factorial.get(2));
        Assert.assertEquals(BigInteger.valueOf(39916800), Factorial.get(11));
        Assert.assertEquals(BigInteger.valueOf(479001600), Factorial.get(12)); // Граничное значение факториала которое помещается в int
    }

    @Test
    void naturalLong() {
        Assert.assertEquals(BigInteger.valueOf(6227020800L), Factorial.get(13));
        Assert.assertEquals(BigInteger.valueOf(87178291200L), Factorial.get(14));
        Assert.assertEquals(BigInteger.valueOf(121645100408832000L), Factorial.get(19));
        Assert.assertEquals(BigInteger.valueOf(2432902008176640000L), Factorial.get(20)); // Граничное значение факториала которое помещается в long
    }

    @Test
    void naturalBigInt() {
        Assert.assertEquals(new BigInteger("51090942171709440000"), Factorial.get(21));
        Assert.assertEquals(new BigInteger("1124000727777607680000"), Factorial.get(22));
        Assert.assertEquals(new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"), Factorial.get(100));
    }

    @Test
    void lessZero() {
        Assert.assertNull(Factorial.get(-1));
        Assert.assertNull(Factorial.get(-2));
    }
}