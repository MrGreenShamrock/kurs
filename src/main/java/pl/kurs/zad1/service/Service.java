package pl.kurs.zad1.service;

public class Service {

    public static boolean isArithmetic(int[] sequence) {
        if (sequence == null || sequence.length < 2) {
            return false;
        } else {
            int commonDifference = sequence[1] - sequence[0];
            for (int i = 0; i < sequence.length - 1; i++) {
                int currentDifference = sequence[i + 1] - sequence[i];
                if (currentDifference != commonDifference) {
                    return false;
                }
            }
            return true;
        }
    }
}


