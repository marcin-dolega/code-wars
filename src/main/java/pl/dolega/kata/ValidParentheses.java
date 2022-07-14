package pl.dolega.kata;

import java.util.List;
import java.util.stream.Collectors;

public class ValidParentheses {

    public static boolean validParentheses(String parens) {

        List<Character> originalList = parens.chars().mapToObj(c -> (char) c)
                .filter(c -> c == '(' || c == ')')
                .collect(Collectors.toList());

        List<Character> sortedList = originalList.stream()
                .sorted()
                .collect(Collectors.toList());

        if (sortedList.lastIndexOf('(') != (sortedList.size() / 2 - 1)) {
            return false;
        }

        while (originalList.size() > 0) {
            if (originalList.get(0) == ')') {
                return false;
            }
            originalList.remove(0);
            originalList.remove(originalList.indexOf(')'));
        }
        return true;
    }
}
