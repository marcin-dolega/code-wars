package pl.dolega;

import pl.dolega.kata._4kyu.StripComments;

import java.io.PrintStream;

public class App {

    public static void main(String[] args) {

        System.out.println(StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"}));
//        System.out.println(StripComments.stripComments("a #b\nc\n\nc[\n]\nd $e f g", new String[] { "#", "$" }));
//        System.out.println(StripComments.stripComments("[#a#]", new String[] { "#", "$" }));

    }
}