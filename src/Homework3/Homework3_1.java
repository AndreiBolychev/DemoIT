import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод размера массива: ");
        int razmer = scanner.nextInt();
        int[] array = new int[razmer];
        for (int i = 0; i < razmer; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Массив в прямом порядке:");
        for (int i = 0; i < razmer; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Массив в обратном порядке:");
        for (int i = razmer - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}