package pl.dolega.kata._6kyu;

import java.util.stream.IntStream;

public class MultiplesOf3Or5 {

    public int solution(int number) {
        return IntStream.range(3, number)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();
    }
}
