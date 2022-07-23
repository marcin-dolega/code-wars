package pl.dolega.kata;

import java.util.ArrayList;
import java.util.List;

public class DontGiveMeFive {

    public static int dontGiveMeFive(int start, int end) {
        List<Integer> list = new ArrayList<>();
        for (Integer i = start; i <= end ; i++) {
            if (!i.toString().contains("5")) {
                list.add(i);
            }
        }
        return list.size();
    }
}
