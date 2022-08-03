package pl.dolega.kata._6kyu;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.LongStream.of;

public class SqProd2Sum {

    public static List<long[]> prod2Sum(long a, long b, long c, long d) {

            var ef1 = of(a * c + b * d, Math.abs(a * d - b * c)).sorted().toArray();
            var ef2 = of(a * d + b * c, Math.abs(a * c - b * d)).sorted().toArray();
            return ef1[0] == ef2[0] ? List.of(ef1) : List.of(ef1, ef2);
        }
    }
//        long ab = (long) (Math.pow(a, 2) + Math.pow(b, 2));
//        long cd = (long) (Math.pow(c, 2) + Math.pow(d, 2));
//        long n = ab * cd;
//
//        List<Long> atomicList = getAtomicList(n);
//        return getPairList(atomicList, n);
//    }
//
//    private static List<Long> getAtomicList(long n) {
//        List<Long> atomicList = new ArrayList<>();
//        long i = 1;
//        while (Math.pow(i, 2) < n) {
//            atomicList.add(i);
//            i++;
//        }
//        return atomicList;
//    }
//
//    private static List<long[]> getPairList(List<Long> atomicList, long n) {
//        List<long[]> pairList = new ArrayList<>();
//        for (long l : atomicList) {
//            for (long r : atomicList) {
//                if (
//                        (Math.pow(l, 2) + Math.pow(r, 2) == n) && Math.pow(l, 2) <= n ||
//                                (Math.pow(l, 2) - Math.pow(r, 2) == n) && Math.pow(l, 2) <= n
//                ) {
//                    pairList.add(new long[]{l, r});
//                }
//            }
//        }
//        return pairList;
//    }
//}
