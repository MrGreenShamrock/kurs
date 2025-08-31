package pl.kurs.zad4.service;

public class Report {

    private final static String INCREASING = "rosnący";
    private final static String DECREASING = "malejący";
    private final static String NOT_MONOTONIC = "nie monotoniczny";

    public String checkMonotonicity(int[] array) {
        boolean decreasing = true;
        boolean increasing = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                decreasing = false;
            }
            if (array[i] > array[i + 1]) {
                increasing = false;
            }
        }

        if (increasing) {
            return INCREASING;
        } else if (decreasing) {
            return DECREASING;
        } else {
            return NOT_MONOTONIC;
        }
    }

    public int[] findMinMax(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
                if (array[i] > max) {
                    max = array[i];
                }
            }
        return new int[]{min, max};
    }

    public int findMostFrequent(int[] array) {
        int mostFrequent = array[0];
        int maxCount = 1;

        for (int i = 0; i < array.length; i++) {
            int count = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = array[i];
            }
        }

        int tieCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
                if (count == maxCount) {
                    tieCount++;
                }
                if (maxCount != 0) {
                    tieCount /= maxCount;
                }
                if (tieCount > 1) {
                    return -1;
                }
            }
        }
        return mostFrequent;
    }

    public boolean checkFullRange(int[] array, int min, int max) {
        boolean[] present = new boolean[max - min + 1];

        for (int i = 0; i < array.length; i++) {
            present[array[i] - min] = true;
        }

        for (boolean b : present) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}

