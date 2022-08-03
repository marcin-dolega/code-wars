package pl.dolega.kata._6kyu;

import java.util.Arrays;

public class SumParts {

    public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length + 1];
        int sum = Arrays.stream(ls).sum();
        for (int i = 0; i < ls.length; i++) {
            result[i] = sum;
            sum = sum - ls[i];
        }
        return result;
    }
}
