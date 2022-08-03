package pl.dolega;

import org.junit.Assert;
import org.junit.Test;
import pl.dolega.kata._4kyu.SudokuValidator;

public class SudokuValidatorTest {

    int[][] sudoku = {
            {7, 2, 6, 4, 9, 3, 8, 1, 5},
            {3, 1, 5, 7, 2, 8, 9, 4, 6},
            {4, 8, 9, 6, 5, 1, 2, 3, 7},
            {8, 5, 2, 1, 4, 7, 6, 9, 3},
            {6, 7, 3, 9, 8, 5, 1, 2, 4},
            {9, 4, 1, 3, 6, 2, 7, 5, 8},
            {1, 9, 4, 8, 3, 6, 5, 7, 2},
            {5, 6, 7, 2, 1, 4, 3, 8, 9},
            {2, 3, 8, 5, 7, 9, 4, 6, 1}
    };


    @Test
    public void rowsTest() {
        Assert.assertTrue(SudokuValidator.check(sudoku));
    }
}
