package pl.dolega._6kyu;

import org.junit.Test;
import pl.dolega.kata._6kyu.SumOfDigits;

import static org.junit.Assert.assertEquals;

public class SumOfDigitsTest {

    @Test
    public void Test1() {
        assertEquals( 7, SumOfDigits.digital_root(16));
    }
    @Test
    public void Test2() {
        assertEquals( 6, SumOfDigits.digital_root(456));
    }
}
