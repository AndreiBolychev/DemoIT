package Homework5;

public class Bankomat {
    private int count20;
    private int count50;
    private int count100;

    public Bankomat(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public void vnesenie(int add20, int add50, int add100) {
        if (add20 >= 0 && add50 >= 0 && add100 >= 0) {
            count20 += add20;
            count50 += add50;
            count100 += add100;
            System.out.println("Деньги внесены");
        } else {
            System.out.println("Неправильное внесение");
        }
    }

    public boolean snyatie(int amount) {
        int originalAmount = amount;

        if (amount % 10 != 0 || amount < 20 || (amount == 30)) {
            System.out.println("Нельзя выдать: " + amount);
            return false;
        }

        int use100 = Math.min(amount / 100, count100);
        amount -= use100 * 100;

        int use50 = Math.min(amount / 50, count50);
        amount -= use50 * 50;

        int use20 = Math.min(amount / 20, count20);
        amount -= use20 * 20;

        if (amount == 0) {
            count100 -= use100;
            count50 -= use50;
            count20 -= use20;

            System.out.println("Выдано " + originalAmount + " рублей купюрами:");
            if (use100 > 0) System.out.println("100 рублей: " + use100);
            if (use50 > 0) System.out.println("50 рублей: " + use50);
            if (use20 > 0) System.out.println("20 рублей: " + use20);
            return true;
        } else {
            System.out.println("Недостаточно купюр " + originalAmount + " рублей.");
            return false;
        }
    }

    public void printStatus() {
        System.out.println("Осталось денег в банкомате:");
        System.out.println("Купюры по 20 рублей: " + count20);
        System.out.println("Купюры по 50 рублей: " + count50);
        System.out.println("Купюры по 100 рублей: " + count100);
    }

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(7, 4, 5);

        bankomat.printStatus();
        System.out.println();

        bankomat.vnesenie(3, 5, 2);
        System.out.println();

        bankomat.snyatie(130);
        System.out.println();

        bankomat.printStatus();
    }
}