package pl.dolega.kata._6kyu;

import java.util.stream.LongStream;

public class CountTheDivisibleNumbers {

    public static long divisibleCount(long x, long y, long k) {
        if (x == y && x % k != 0) {
            return 0L;
        }
        long counter = 0;
        for (long i = y; i >= x; i--) {
            if (i % k == 0) {
                counter = i / k;
                break;
            }
        }
        for (long i = x; i >= 0; i--) {
            if (i % k == 0) {
                counter = counter - (i / k);
                break;
            }
        }
        if (x == 0 || x % k == 0) {
            counter++;
        }
        if (counter < 0) {
            return 0L;
        }
        return counter;
    }

    public static long divisibleCount2(long x, long y, long k) {
        if(x%k ==0) return (y/k - x/k + 1);
        else return (y/k - x/k);
    }

    public static long streamSolution(long x, long y, long k) {
        return LongStream.range(x, k + 1).filter(e -> e % k == 0).count();
    }
}
