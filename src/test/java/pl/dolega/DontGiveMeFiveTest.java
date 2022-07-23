package pl.dolega;

import org.junit.Assert;
import org.junit.Test;
import pl.dolega.kata.DontGiveMeFive;

public class DontGiveMeFiveTest {

    @Test
    public void dontGiveMeFiveTest() {
        int result = DontGiveMeFive.dontGiveMeFive(1,9);
        Assert.assertEquals(8, result);
    }
}
