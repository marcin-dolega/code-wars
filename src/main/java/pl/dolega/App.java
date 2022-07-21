package pl.dolega;

import pl.dolega.kata.EnoughIsEnough;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(EnoughIsEnough.deleteNth(new int[]{1, 2, 3, 1, 2, 1, 2, 3}, 2)));
    }
}
