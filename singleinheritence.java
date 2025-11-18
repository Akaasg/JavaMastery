import java.util.*;

class singleinheritence {
    String ownerName;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        ownerName = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void balancee() {
        System.out.println("Account Holder: " + ownerName);
        System.out.println("Balance: ₹" + balance);
    }
}

class main extends singleinheritence {
    double interestRate = 5.5;

    void interest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Annual Interest: ₹" + interest);
    }

    public static void main(String[] args) {
        main obj1 = new main();
        obj1.input();
        obj1.balancee();
        obj1.interest();
    }
}