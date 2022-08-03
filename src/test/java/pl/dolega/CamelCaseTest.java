package pl.dolega;

import org.junit.Assert;
import org.junit.Test;
import pl.dolega.kata._6kyu.CamelCase;

public class CamelCaseTest {

    @Test
    public void camelCaseTest() {
        // given
        String s = "camelCaseTest";
        // when
        String test = CamelCase.camelCase(s);
        // then
        Assert.assertEquals("camel Case Test", test);
    }
}
