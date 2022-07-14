package pl.dolega;

import pl.dolega.kata.HumanReadableTime;
import pl.dolega.kata.SumParts;

public class App {

    public static void main( String[] args ) {

        System.out.println(HumanReadableTime.makeReadable(0));
        System.out.println(HumanReadableTime.makeReadable(86399));

    }

}
