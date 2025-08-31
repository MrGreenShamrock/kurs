package pl.kurs.zad3.app;

import pl.kurs.zad3.service.Service;

public class Runner {
    public static void main(String[] args) {

        int[] array = Service.superPrimes(1, 25);

        System.out.println("Liczby super-pierwsze z zakresu: ");

        for (int a : array) {
            System.out.println(a);
        }
    }
}
