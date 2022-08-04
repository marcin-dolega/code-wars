package pl.dolega._6kyu;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pl.dolega.kata._6kyu.IsPrime;

import static org.junit.Assert.assertEquals;

public class IsPrimeTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 13})
    public void isPrimeTrueTest(int number) {
        boolean result = IsPrime.isPrime(number);
        assertEquals(true, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,-3, 9, 15, 21})
    public void isPrimeFalseTest(int number) {
        boolean result = IsPrime.isPrime(number);
        assertEquals(false, result);
    }
}
