// (Same method name, different parameters)
import java.util.Scanner;
class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {   // Overloaded method
        return a + b + c;
    }
}
public class StaticPolymorphismExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperations m = new MathOperations();
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of two numbers = " + m.add(a, b));
        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("Sum of three numbers = " + m.add(x, y, z));
        sc.close();
    }
}
