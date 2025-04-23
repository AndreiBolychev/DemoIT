package Homework3;

import java.util.Scanner;

public class Homework3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввод размера массива: ");
        int razmer = scanner.nextInt();

        int[] array = new int[razmer];

        for (int i = 0; i < razmer; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Массив до расстановки:");
        for (int i = 0; i < razmer; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < razmer / 2; i++) {
            int rast = array[i];
            array[i] = array[razmer - 1 - i];
            array[razmer - 1 - i] = rast;
        }

        System.out.println("Массив после расстановки:");
        for (int i = 0; i < razmer; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
