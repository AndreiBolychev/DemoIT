import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework7 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        metod1();
        metod2();
        metod3();
        metod4();
        scanner.close();
    }

    public static void metod1() {
        System.out.println("ввод числа:");
        try {
            int a = scanner.nextInt();
            System.out.println("число: " + a);
        } catch (InputMismatchException e) {
            System.out.println("неверное число");
            scanner.nextLine();
        }
        System.out.println();
    }

    public static void metod2() {
        System.out.println("ввод числа на которое делим 100:");
        try {
            int a = scanner.nextInt();
            int result = 100 / a;
            System.out.println("100 / " + a + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("на 0 делить нельзя");
        } catch (InputMismatchException e) {
            System.out.println("неверное число");
            scanner.nextLine();
        }
        System.out.println();
    }

    public static void metod3() {
        System.out.println("ввод числа на которое делим 200");
        try {
            int a = scanner.nextInt();
            int result = 200 / a;
            System.out.println("200 / " + a + " = " + result);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("на 0 делить нельзя");
            if (e instanceof InputMismatchException) {
                scanner.nextLine();
            }
        }
        System.out.println();
    }

    public static void metod4() {
        System.out.println("ввод числа на которое делим 300:");
        try {
            int a = scanner.nextInt();
            int result = 300 / a;
            System.out.println("300 / " + a + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("неверное число");
        } catch (ArithmeticException e) {
            System.out.println("на 0 делить нельзя");
        } finally {
            System.out.println("проверка окончена\n");
            scanner.nextLine();
        }
    }
}