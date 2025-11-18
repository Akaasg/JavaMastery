import java.util.Scanner;
class Vehicle {
    public void start() {
        System.out.println("Vehicle starts.");
    }
}
class Car extends Vehicle {         // Level 1
    public void drive() {
        System.out.println("Car is driving.");
    }
}
class SportsCar extends Car {       // Level 2
    public void turbo() {
        System.out.println("Sports Car turbo activated!");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press Enter to see Sports Car features: ");
        sc.nextLine();
        SportsCar scObj = new SportsCar();
        scObj.start();
        scObj.drive();
        scObj.turbo();
        sc.close();
    }
}
