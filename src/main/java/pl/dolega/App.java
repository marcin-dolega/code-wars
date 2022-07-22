package pl.dolega;

import pl.dolega.kata.SqProd2Sum;

import java.util.List;

import static java.lang.System.*;

public class App {

    public static void main(String[] args) {

//        for (int i = 0; i < 100; i++) {
//            List<long[]> list = SqProd2Sum.prod2Sum(
//                    (long) (Math.random() * 100) + 1,
//                    (long) (Math.random() * 100 + 1),
//                    (long) (Math.random() * 100) + 1,
//                    (long) (Math.random() * 100));
//            out.println(list.size());
//            for (int j = 0; j < list.size(); j++) {
//                out.println(list.get(j)[0] + " " + list.get(j)[1]);
//            }
//            out.println();
//        }

        List<long[]> list = SqProd2Sum.prod2Sum(1, 2, 1, 3);
        out.println(list.get(0)[0] + " " + list.get(0)[1]);
        out.println(list.get(1)[0] + " " + list.get(1)[1]);
    }
}
