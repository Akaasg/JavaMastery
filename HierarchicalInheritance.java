import java.util.Scanner;
class Shape {
    public void display() {
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
    public void drawCircle() {
        System.out.println("Drawing circle...");
    }
}
class Square extends Shape {
    public void drawSquare() {
        System.out.println("Drawing square...");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Circle or 2 for Square:");
        int choice = sc.nextInt();
        if (choice == 1) {
            Circle c = new Circle();
            c.display();
            c.drawCircle();
        } else {
            Square s = new Square();
            s.display();
            s.drawSquare();
        }
        sc.close();
    }
}
