package Homework8;

import java.util.Scanner;

public class Homework8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод 3 строк
        System.out.println("ввод 1 строки:");
        String str1 = scanner.nextLine();
        System.out.println("ввод 2 строки:");
        String str2 = scanner.nextLine();
        System.out.println("ввод 3 строки:");
        String str3 = scanner.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();
        double average = (len1 + len2 + len3) / 3.0;

        System.out.printf("\nсредняя длина строки: %.2f\n", average);
        System.out.println("строки короче средней:");

        if (len1 < average) {
            System.out.println(str1 + " (длина: " + len1 + ")");
        }
        if (len2 < average) {
            System.out.println(str2 + " (длина: " + len2 + ")");
        }
        if (len3 < average) {
            System.out.println(str3 + " (длина: " + len3 + ")");
        }
        scanner.close();
    }
}
