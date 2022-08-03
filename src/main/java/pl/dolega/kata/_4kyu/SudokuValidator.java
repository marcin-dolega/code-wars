package pl.dolega.kata._4kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SudokuValidator {

    public static boolean check(int[][] sudoku) {

        boolean rows = validateRows(sudoku);
        boolean columns = validateColumns(sudoku);
        boolean squares = (validateSquares(sudoku));
        return rows && columns && squares;
    }

    static boolean validateRows(int[][] sudoku) {
        int[] array;
        for (int[] e : sudoku) {
            array = Arrays.stream(e).sorted().toArray();
            for (int i = 0; i < 8; i++) {
                if (array[i] + 1 != array[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean validateColumns(int[][] sudoku) {
        int[] array;
        for (int i = 0; i < 9; i++) {
            array = new int[9];
            for (int j = 0; j < 9; j++) {
                array[j] = sudoku[j][i];
            }
            array = Arrays.stream(array).sorted().toArray();
            for (int k = 0; k < 8; k++) {
                if (array[k] + 1 != array[k + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean validateSquares(int[][] sudoku) {
        List<Integer> sorted = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                list.clear();
                for (int m = i; m < 3 + i; m++) {
                    for (int n = j; n < 3 + j; n++) {
                        list.add(sudoku[m][n]);
                    }
                }
                if (!list.stream().sorted().collect(Collectors.toList()).equals(sorted)) {
                    return false;
                }
            }
        }
            return true;
    }
}
