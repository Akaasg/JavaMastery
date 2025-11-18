import java.util.Scanner;
class Student {
    private String name;   // Encapsulated variables
    private int age;
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // Getter methods
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
 class EncapsulationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        s.setName(name);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        s.setAge(age);
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        sc.close();
    }
}
