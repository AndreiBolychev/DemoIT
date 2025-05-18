package Homework8;

import java.util.*;

public class Homework8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ввод 1 строки:");
        String str1 = scanner.nextLine();

        System.out.println("ввод 2 строки:");
        String str2 = scanner.nextLine();

        System.out.println("ввод 3 строки:");
        String str3 = scanner.nextLine();

        List<String> strings = new ArrayList<>();
        strings.add(str1);
        strings.add(str2);
        strings.add(str3);

        strings.sort(Comparator.comparingInt(String::length));

        System.out.println("\nстроки по возрастанию длины:");
        for (String s : strings) {
            System.out.println(s);
        }
        scanner.close();
    }
}
