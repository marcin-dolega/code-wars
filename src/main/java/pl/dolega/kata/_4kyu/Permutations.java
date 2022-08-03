package pl.dolega.kata._4kyu;

import java.util.*;

public class Permutations {

    public static List<String> singlePermutations(String s) {

        Set<String> setOfPossibilities = getPossibilities(s.length());
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (String possibility : setOfPossibilities) {
            sb.setLength(0);
            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(Integer.parseInt(String.valueOf(possibility.charAt(i)))));
            }
            result.add(sb.toString());
        }
        return result.stream()
                .distinct()
                .sorted()
                .toList();
    }

    public static Set<String> getPossibilities(int stringLength) {

        List<Integer> integers = new ArrayList<>();
        Set<String> setOfPossibilities = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < stringLength; i++) {
            integers.add(i);
        }

        do {
            sb.setLength(0);
            Collections.shuffle(integers);
            for (int i : integers) {
                sb.append(i);
            }
            setOfPossibilities.add(sb.toString());
        } while (setOfPossibilities.size() != factorial(integers.size()));

        return setOfPossibilities;
    }

    public static int factorial(int input) {
        int result = 1;
        for (int i = 2; i < input + 1; i++) {
            result *= i;
        }
        return result;
    }
}
