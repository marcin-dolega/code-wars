package pl.dolega;

import pl.dolega.kata.SumParts;

public class App {

    public static void main( String[] args ) {

        int[] array = {1, 2, 3, 4, 5, 6};

        int[] result = SumParts.sumParts(array);

        for (int i : result) {
            System.out.println(i);
        }

    }

}
