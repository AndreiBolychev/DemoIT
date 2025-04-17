package Homework2;

import java.util.Scanner;
/*Напишите программу, где пользователь вводит любое целое положительное
число.
А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные*/

public class Homework2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Введите целое положительное число: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num > 0) {
                    break;
                } else {
                    System.out.println("Ошибка! Вы должны ввести число, которое больше нуля!");
                }
            } else {
                System.out.println("Ошибка! Вы ввели не целое число!");
                scanner.next();
            }
        }
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + num + " = " + sum);
        scanner.close();
    }
}