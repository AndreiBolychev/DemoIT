package Homework3;

import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввод размера массива: ");
        int razmer = scanner.nextInt();

        int[] array = new int[razmer];

        for (int i = 0; i < razmer; i++) {
            array[i] = (int) (Math.random() * 100); //
        }

        System.out.println("Сгенерированный массив:");
        for (int i = 0; i < razmer; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min = 0;
        int max = 0;

        for (int i = 1; i < razmer; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
            if (array[i] > array[max]) {
                max = i;
            }
        }

        System.out.println("Минимальный элемент: " + array[min] + " индекс " + min);
        System.out.println("Максимальный элемент: " + array[max] + " индекс " + max);
    }
}