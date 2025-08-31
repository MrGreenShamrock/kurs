package pl.kurs.zad2.service;

public class Service {

    private final static String ARITHMETIC = "ARYTMETYCZNY";
    private final static String GEOMETRIC = "GEOMETRYCZNY";
    private final static String DIFFERENT = "INNY";

    public static String getSequenceName(int[] sequence) {
        if (sequence == null || sequence.length < 2) {
            return DIFFERENT;
        }

        boolean arithmetic = isArithmetic(sequence);
        boolean geometric = isGeometric(sequence);

        if (arithmetic && geometric) {
            return ARITHMETIC + " i " + GEOMETRIC;
        } else if (arithmetic) {
            return ARITHMETIC;
        } else if (geometric) {
            return GEOMETRIC;
        } else {
            return DIFFERENT;
        }
    }

    private static boolean isArithmetic(int[] sequence) {
        int commonDifference = sequence[1] - sequence[0];
        for (int i = 0; i < sequence.length - 1; i++) {
            int currentDifference = sequence[i + 1] - sequence[i];
            if (currentDifference != commonDifference) {
                return false;
            }
        }
        return true;
    }

    private static boolean isGeometric(int[] sequence) {
        if (sequence[0] == 0) {
            for (int i = 0; i < sequence.length; i++) {
                if (sequence[i] != 0) {
                    return false;
                }
            }
        } else {
            double commonRatio = (double) sequence[1] / sequence[0];
            for (int i = 0; i < sequence.length - 1; i++) {
                if (sequence[i] == 0) {
                    if (commonRatio != 0 || sequence[i + 1] != 0) {
                        return false;
                    }
                } else {
                    double currentRatio = (double) sequence[i + 1] / sequence[i];
                    if (currentRatio != commonRatio) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
