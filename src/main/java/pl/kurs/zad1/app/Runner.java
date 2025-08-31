package pl.kurs.zad1.app;

import static pl.kurs.zad1.service.Service.isArithmetic;

public class Runner {
    public static void main(String[] args) {

        int[] array1 = {3, 5, 7, 9};
        int[] array2 = {1, 3, 4, 5};
        int[] array3 = {1, 1, 1, 1};
        int[] array4 = {1, 2};
        int[] array5 = {0};
        int[] array6 = {9, 7, 5, 3};

        System.out.println("Ciąg z tablicy 1 jest arytmetyczny: " + isArithmetic(array1));
        System.out.println("Ciąg z tablicy 2 jest arytmetyczny: " + isArithmetic(array2));
        System.out.println("Ciąg z tablicy 3 jest arytmetyczny: " + isArithmetic(array3));
        System.out.println("Ciąg z tablicy 4 jest arytmetyczny: " + isArithmetic(array4));
        System.out.println("Ciąg z tablicy 5 jest arytmetyczny: " + isArithmetic(array5));
        System.out.println("Ciąg z tablicy 6 jest arytmetyczny: "  + isArithmetic(array6));

    }
}
