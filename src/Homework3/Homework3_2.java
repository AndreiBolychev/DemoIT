package Homework3;

import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввод размера массива: ");
        int razmer = scanner.nextInt();

        int[] array = new int[razmer];

        for (int i = 0; i < razmer; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Рандомный массив:");
        for (int i = 0; i < razmer; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min = array[0];
        int max = array[0];


        for (int i = 1; i < razmer; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}