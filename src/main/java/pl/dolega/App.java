package pl.dolega;

import pl.dolega.kata.ValidParentheses;

public class App {

    public static void main(String[] args) {

        System.out.println(ValidParentheses.validParentheses("(()(())())()"));
        System.out.println(ValidParentheses.validParentheses("))()()(("));


    }

}
