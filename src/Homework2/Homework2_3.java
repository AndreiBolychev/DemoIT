package Homework2;

public class Homework2_3 {
/*Составьте программу, выводящую на экран квадраты чисел от 10 до 20
включительно.*/

    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) {
            int kvadrat = i * i;
            System.out.println("Квадрат числа " + i + " = " + kvadrat);
        }
    }
}
