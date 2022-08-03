package pl.dolega.kata._6kyu;

import java.util.ArrayList;
import java.util.List;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> list = new ArrayList<>();
        for (int e : elements) {
            if (
                    list.stream()
                            .filter(i -> i.equals(e))
                            .toList()
                            .size() < maxOccurrences
            ) {
                list.add(e);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
