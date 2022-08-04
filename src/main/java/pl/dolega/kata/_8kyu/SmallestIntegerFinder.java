package pl.dolega.kata._8kyu;

import java.util.Arrays;

public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }
}
