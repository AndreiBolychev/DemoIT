package Homework5;

public class CreditCard {
    private String numAccount;
    private double balans;

    public CreditCard(String numAccount, double balans) {
        this.numAccount = numAccount;
        this.balans = balans;
    }

    public void zarplata(double amount) {
        if (amount > 0) {
            balans += amount;
            System.out.println("На номер счета " + numAccount + " поступило " + amount + " рублей");
        } else {
            System.out.println("Сумма для пополнения должна быть положительной.");
        }
    }

    public void vivod(double amount) {
        if (amount > 0 && amount <= balans) {
            balans -= amount;
            System.out.println("Со счета " + numAccount + " сделано снятие " + amount + " рублей");
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    public void printInfo() {
        System.out.println("номер счета: " + numAccount + ", Баланс: " + balans + " рублей");
    }

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("номер счета 1", 15000.0);
        CreditCard card2 = new CreditCard("номер счета 2", 1000.0);
        CreditCard card3 = new CreditCard("номер счета 3", 8000.0);

        card1.zarplata(1500.0);
        card2.zarplata(2000.0);
        card3.vivod(3000.0);

        System.out.println("\nСостояние счетов:");
        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}
