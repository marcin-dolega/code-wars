package pl.dolega.kata._6kyu;

public class IsPrime {

    public static boolean isPrime(int num) {
        if (num < 2 || (num > 2 && num % 2 == 0)) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i = i + 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
