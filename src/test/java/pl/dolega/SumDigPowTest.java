package pl.dolega;

import org.junit.Assert;
import org.junit.Test;
import pl.dolega.kata._6kyu.SumDigPow;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumDigPowTest {

    @Test
    public void test() {
        // given
        int min = 1;
        int max = 100;
        List<Long> testList = Arrays.stream(new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 89})
                .boxed()
                .collect(Collectors.toList());
        // when
        List<Long> list = SumDigPow.sumDigPow(min, max);
        // then
        Assert.assertEquals(testList, list);
    }
}
