package Homework8;

import java.util.Scanner;

public class Homework8_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ввод трех строк:");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

        String shortest = s1;
        String longest = s1;

        if (s2.length() < shortest.length()) {
            shortest = s2;
        }
        if (s2.length() > longest.length()) {
            longest = s2;
        }

        if (s3.length() < shortest.length()) {
            shortest = s3;
        }
        if (s3.length() > longest.length()) {
            longest = s3;
        }

        System.out.println("самая короткая строка: \"" + shortest + "\" (с длинной " + shortest.length() + ")");
        System.out.println("самая длинная строка:  \"" + longest + "\" (с длинной " + longest.length() + ")");

        scanner.close();
    }
}