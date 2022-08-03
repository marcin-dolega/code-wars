package pl.dolega.kata._6kyu;

import java.util.Arrays;
import java.util.List;

public class Order {

    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }
        List<String> list = Arrays.asList(words.split(" "));
        System.out.println(list);
        String[] array = new String[list.size()];
        list.stream()
                .forEach(s ->
                    array[Integer.parseInt(s.replaceAll("\\D+", "")) - 1] = s
                );
        return String.join(" ", array);
    }
}
