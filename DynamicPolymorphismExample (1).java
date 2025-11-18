// (Parent reference → child object)
import java.util.Scanner;
class Bank {
    public void interestRate() {
        System.out.println("General bank interest rate: 5%");
    }
}
class SBI extends Bank {
    @Override
    public void interestRate() {
        System.out.println("SBI interest rate: 6%");
    }
}
class HDFC extends Bank {
    @Override
    public void interestRate() {
        System.out.println("HDFC interest rate: 7%");
    }
}
public class DynamicPolymorphismExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose bank: 1. SBI  2. HDFC");
        int choice = sc.nextInt();
        Bank b;   // Parent reference
        if (choice == 1) {
            b = new SBI();
        } else {
            b = new HDFC();
        }
        b.interestRate();  // Runtime polymorphism
        sc.close();
    }
}
