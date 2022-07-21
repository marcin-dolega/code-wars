package pl.dolega;

import org.junit.Assert;
import org.junit.Test;
import pl.dolega.kata.EnoughIsEnough;

import java.util.Arrays;

public class EnoughIsEnoughTest {

    @Test
    public void deleteNthOccurrencesTest() {
        int[] array = new int[]{1, 2, 3, 1, 2, 1, 2, 3};
        int[] expected = new int[]{1, 2, 3, 1, 2, 3};
        int[] actual = EnoughIsEnough.deleteNth(array, 2);
        Assert.assertEquals(0, Arrays.compare(expected, actual));
    }
}
