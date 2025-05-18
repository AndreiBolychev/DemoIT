import java.util.Scanner;

public class Homework8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ввод 1 строки:");
        String str1 = scanner.nextLine();

        System.out.println("ввод 2 строки:");
        String str2 = scanner.nextLine();

        System.out.println("ввод 3 строки:");
        String str3 = scanner.nextLine();

        String allText = str1 + " " + str2 + " " + str3;
        String[] words = allText.split("\\s+");

        for (String word : words) {
            if (checkzak(word)) {
                System.out.println("первое слово из разных символов: " + word);
                scanner.close();
                return;
            }
        }

        System.out.println("таких слов тут нет");
        scanner.close();
    }

    private static boolean checkzak(String word) {
        java.util.Set<Character> chars = new java.util.HashSet<>();

        for (char c : word.toCharArray()) {
            if (!chars.add(c)) {
                return false;
            }
        }
        return true;
    }
}
