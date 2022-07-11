package pl.dolega.kata;

import java.util.ArrayList;
import java.util.List;

public class SumDigPow {

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> list = new ArrayList<>();
        int result;
        while (a <= b) {
            result = 0;
            String s = String.valueOf(a);
            for (int i = 0; i < s.length(); i++) {
                result += Math.pow(Integer.parseInt(String.valueOf(s.charAt(i))), i + 1);
            }
            if (result == a) {
                list.add(a);
            }
            a++;
        }
        return list;
    }
}
