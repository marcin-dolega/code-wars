package pl.dolega;

import java.util.ArrayList;
import java.util.List;

public class CamelCase {

    public static String camelCase(String input) {

        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < input.length(); i++) {
            String s = String.valueOf(input.charAt(i));
            if (!s.equals(s.toLowerCase())) {
                list.add(input.substring(counter, i));
                counter = i;
            }
            if (i == input.length() - 1) {
                list.add(input.substring(counter, i + 1));
            }
        }
        for (String s : list) {
            sb.append(s + " ");
        }
        return sb.toString().trim();
    }
}
