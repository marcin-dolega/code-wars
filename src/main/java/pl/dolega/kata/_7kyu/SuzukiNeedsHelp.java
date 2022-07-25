package pl.dolega.kata._7kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;
import static java.util.function.UnaryOperator.identity;

public class SuzukiNeedsHelp {

    public static String[] lineupStudents(String students) {

        String[] array = students.trim().split(" ");
        String[] arraySorted = Arrays.stream(array).sorted(comparingInt(String::length)).toArray(String[]::new);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arraySorted.length; i++) {
            array[i] = arraySorted[arraySorted.length - 1 - i];
        }

        for (int i = 0; i < array[0].length(); i++) {
            ArrayList<String> strings = new ArrayList<>();
            for (int j = 0; j < array.length; j++) {
                if (array[j].length() == i + 1) {
                    strings.add(array[j]);
                }
            }
            strings.stream().sorted().forEach(list::add);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(list.size() - 1 - i);
        }
        return array;
    }

    public static String[] lineupStudentsStream(final String students) {
        return Stream.of(students.split(" "))
                .sorted(comparingInt(String::length).thenComparing(identity()).reversed())
                .toArray(String[]::new);
    }
}
