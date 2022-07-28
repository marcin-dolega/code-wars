package pl.dolega.kata._4kyu;

import java.util.regex.Pattern;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {

        StringBuilder stringBuilder = new StringBuilder();

        for (String s : commentSymbols) {
            stringBuilder.append("\\" + s + "|");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

//        text = Pattern.compile("\s*(" + stringBuilder + ")(.*?)\s*\n\s*").matcher(text).replaceAll("\n");
//        text = Pattern.compile("\s*(" + stringBuilder + ")(.*?)\s*$").matcher(text).replaceAll("");
//        text = Pattern.compile("\s*\n").matcher(text).replaceAll("\n");

        String[] array = text.split("\\n");

        for (int i = 0; i < array.length; i++) {
            array[i] = Pattern.compile("\s*(" + stringBuilder + ")(.*)").matcher(array[i]).replaceAll("");
        }

        stringBuilder.setLength(0);

        for (String s : array) {
            stringBuilder.append(s.trim() + "\n");
        }

        return stringBuilder.toString().trim();
    }
}
