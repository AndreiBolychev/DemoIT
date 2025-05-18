package Homework8;

import java.util.Scanner;

public class Homework8_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ввод строки:");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            result.append(c).append(c);
        }
        System.out.println("Результат: " + result.toString());
        scanner.close();
    }
}
