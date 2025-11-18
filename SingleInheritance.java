import java.util.Scanner;
class Animal {
    public void eat() {
        System.out.println("Animal eats food.");
    }
}
class Dog extends Animal {   // Single inheritance
    public void bark() {
        System.out.println("Dog barks.");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press Enter to see Dog behavior: ");
        sc.nextLine();
        Dog d = new Dog();
        d.eat();
        d.bark();
        sc.close();
    }
}
