package Homework3;

import java.util.Scanner;

public class Homework3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввод размера массива: ");
        int razmer = scanner.nextInt();

        int[] array = new int[razmer];

        System.out.println("Ввод элементов массива:");
        for (int i = 0; i < razmer; i++) {
            System.out.print("Элемент " + i + ": ");
            array[i] = scanner.nextInt(); // тут ручками вводим элементы массива, тк math не используем
        }
        int zero = 0;

        for (int i = 0; i < razmer; i++) {
            if (array[i] == 0) {
                zero++;
            }
        }

        if (zero > 0) {
            System.out.println("Количество нулевых элементов: " + zero);
        } else {
            System.out.println("Нулевых элементов нет.");
        }
    }
}
