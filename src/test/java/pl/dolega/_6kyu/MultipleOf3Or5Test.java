package pl.dolega._6kyu;

import org.junit.Test;
import pl.dolega.kata._6kyu.MultiplesOf3Or5;

import static org.junit.Assert.assertEquals;

public class MultipleOf3Or5Test {

    @Test
    public void solutionTest() {
        MultiplesOf3Or5 multiplesOf3Or5 = new MultiplesOf3Or5();
        int actual = multiplesOf3Or5.solution(10);
        assertEquals(23, actual);
    }
}
