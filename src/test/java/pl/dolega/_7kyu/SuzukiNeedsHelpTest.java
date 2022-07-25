package pl.dolega._7kyu;

import org.junit.Assert;
import org.junit.Test;
import pl.dolega.kata._7kyu.SuzukiNeedsHelp;

public class SuzukiNeedsHelpTest {

    @Test
    public void lineupStudentsTest() {
        String students = "xxa xxb xxc xxd xa xb xc xd";
        String[] actual = SuzukiNeedsHelp.lineupStudents(students);
        String[] expected = new String[] {"xxd", "xxc", "xxb", "xxa", "xd", "xc", "xb", "xa"};
        Assert.assertArrayEquals(expected, actual);
    }
}
