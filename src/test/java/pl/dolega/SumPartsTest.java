package pl.dolega;

import org.junit.Assert;
import org.junit.Test;
import pl.dolega.kata._6kyu.SumParts;

import java.util.Arrays;

public class SumPartsTest {

    @Test
    public void test() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] result = SumParts.sumParts(array);
        int[] expected = new int[]{21, 20, 18, 15, 11, 6, 0};
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }
}
