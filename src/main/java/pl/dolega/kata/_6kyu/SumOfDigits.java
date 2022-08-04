package pl.dolega.kata._6kyu;

import java.util.Arrays;

public class SumOfDigits {

    private static int result;

    public static int digital_root(int n) {
        if (n < 10) {
            result = n;
            return n;
        }
        n = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
        digital_root(n);
        return result;
    }
}
