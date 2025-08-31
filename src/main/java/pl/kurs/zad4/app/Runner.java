package pl.kurs.zad4.app;
import pl.kurs.zad4.service.Report;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Report report = new Report();
        String fileName = "src/main/resources/liczby.txt";

        try (
                Scanner scanner = new Scanner(new File(fileName))
        ) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.trim().isEmpty()) {
                    continue;
                } else if (line.contains(",")) {
                    continue;
                } else if (line.contains(".")) {
                    continue;
                }

                    int count = 0;
                    Scanner lineScanner = new Scanner(line);

                    while (lineScanner.hasNextInt()) {
                        lineScanner.nextInt();
                        count++;
                    }

                    int[] numbers = new int[count];
                    lineScanner = new Scanner(line);

                    for (int i = 0; i < count; i++) {
                        numbers[i] = lineScanner.nextInt();
                    }

                    lineScanner.close();

                    System.out.println("Ciąg liczb: " + line);
                    System.out.println("Monotoniczność: " + report.checkMonotonicity(numbers));
                    int[] minAndMax = report.findMinMax(numbers);
                    System.out.println("Min: " + minAndMax[0] + ", Max: " + minAndMax[1]);
                    System.out.println("Najpopularniejsza liczba w ciągu (brak najpopularniejszej liczby = -1): " + report.findMostFrequent(numbers));
                    System.out.println("Czy między MIN i MAX znajdują się wszystkie możliwe liczby naturalne? = " + report.checkFullRange(numbers, minAndMax[0], minAndMax[1]));
                    System.out.println("----------------------------");
                }

            } catch(FileNotFoundException e){
                System.out.println("Plik: " + fileName + " nie znaleziony.");
                e.printStackTrace();
            }
        }
    }

