package pl.kurs.zad3.service;

public class Service {

    public static int[] superPrimes(int from, int to) {
        int[] result = new int[0];
        int length = to - from + 1;

        for (int i = 0; i < length; i++) {
            int number = from + i;
            if (isPrime(number) && isPrime(sumDigits(number))) {
                int[] newResult = new int[result.length + 1];
                for (int j = 0; j < result.length; j++) {
                    newResult[j] = result[j];
                }
                newResult[result.length] = number;
                result = newResult;
            }
        }
        return result;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else {
            int limit = (int) Math.sqrt(n);
            for (int i = 3; i <= limit; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }


    private static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}


