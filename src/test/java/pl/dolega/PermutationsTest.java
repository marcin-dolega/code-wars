package pl.dolega;

import org.junit.Assert;
import org.junit.Test;
import pl.dolega.kata.Permutations;

import java.util.List;
import java.util.Set;

public class PermutationsTest {

    @Test
    public void factorialTest() {
        int result = Permutations.factorial(4);
        Assert.assertEquals(24, result);
    }

    @Test
    public void possibilitiesTest() {
        Set<String> result = Permutations.getPossibilities(3);
        Assert.assertEquals(Set.of("012", "021", "102", "120", "201", "210"), result);
    }

    @Test
    public void singlePermutationsTest() {
        List<String> result = Permutations.singlePermutations("aabb");
        Assert.assertEquals(List.of("aabb", "abab", "abba", "baab", "baba", "bbaa"), result);
    }
}
