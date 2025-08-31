package pl.kurs.zad2.app;

import pl.kurs.zad2.service.Service;

public class Runner {
    public static void main(String[] args) {

        int[] array1 = {3, 5, 7, 9};
        int[] array2 = {1, 2, 5, 10};
        int[] array3 = {3, 6, 12, 24};
        int[] array4 = {0, 0, 0, 0};
        int[] array5 = {2, 0, 0, 0};
        int[] array6 = {3, -3, 3, -3};
        int[] array7 = {1, 2, 4, 9};
        int[] array8 = {};

        System.out.println("Ciąg z tablicy 1 jest: " + Service.getSequenceName(array1));
        System.out.println("Ciąg z tablicy 2 jest: " + Service.getSequenceName(array2));
        System.out.println("Ciąg z tablicy 3 jest: " + Service.getSequenceName(array3));
        System.out.println("Ciąg z tablicy 4 jest: " + Service.getSequenceName(array4));
        System.out.println("Ciąg z tablicy 5 jest: " + Service.getSequenceName(array5));
        System.out.println("Ciąg z tablicy 6 jest: " + Service.getSequenceName(array6));
        System.out.println("Ciąg z tablicy 7 jest: " + Service.getSequenceName(array7));
        System.out.println("Ciąg z tablicy 8 jest: " + Service.getSequenceName(array8));

    }
}
