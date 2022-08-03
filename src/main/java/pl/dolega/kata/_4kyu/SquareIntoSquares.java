package pl.dolega.kata._4kyu;

import java.util.*;

import static java.lang.System.*;

public class SquareIntoSquares {

    public String decompose(long n) {

        List<Long> list = getSquares(n).stream().sorted(Comparator.reverseOrder()).toList();
        double square;
        out.println(list);

        for (int i = 0; i < list.size(); i++) {
            long sum = 0;
            List<Long> temp = new ArrayList<>();
            for (int j = 0; j < list.size(); j++) {
                square = Math.pow(list.get(j), 2);
                out.println(sum + " " + square);
                if (sum + square <= Math.pow(n, 2)) {
                    temp.add(list.get(j));
                    sum += square;
                    if (sum == (long) Math.pow(n, 2)) {
                        return temp.toString();
                    }
                }
            }
        }


        return null;
    }

    public Set<Long> getSquares(long n) {
        Set<Long> set = new HashSet<>();
        for (long i = n - 1; i > 0; i--) {
            if (hasSquareRoot(i)) {
                set.add(i);
            }
        }
        return set;
    }

    public boolean hasSquareRoot(long number) {
        double sq = Math.sqrt(number);
        return ((sq - Math.floor(sq)) == 0);
    }
}
