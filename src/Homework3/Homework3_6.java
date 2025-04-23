package Homework3;
import java.util.Scanner;

public class Homework3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввод размера массива: ");
        int razmer = scanner.nextInt();

        int[] array = new int[razmer];

        for (int i = 0; i < razmer; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Массив:");
        for (int i = 0; i < razmer; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        boolean vozr = true;

        for (int i = 1; i < razmer; i++) {
            if (array[i] <= array[i - 1]) {
                vozr = false;
                break;
            }
        }

        if (vozr) {
            System.out.println("Массив возрастающий.");
        } else {
            System.out.println("Массив не возрастающий.");
        }
    }
}
