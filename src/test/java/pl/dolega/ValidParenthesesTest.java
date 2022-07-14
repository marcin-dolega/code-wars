package pl.dolega;

import org.junit.Assert;
import org.junit.Test;
import pl.dolega.kata.ValidParentheses;

public class ValidParenthesesTest {

    @Test
    public void shouldReturnTrue() {
        String pattern = "(()(())())()";
        boolean result = ValidParentheses.validParentheses(pattern);
        Assert.assertTrue(result);
    }

    @Test
    public void shouldReturnFalse() {
        String pattern = "(()(())())((";
        boolean result = ValidParentheses.validParentheses(pattern);
        Assert.assertFalse(result);
    }
}
