import java.util.Scanner;
class Parent {
    public void print() {
        System.out.println("This is parent class");
    }
}
class Child extends Parent {
    public void print() {
        System.out.println("This is child class");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'parent' to create an object of the parent class or 'child' to create an object of the child class:");
        String choice = scanner.next();
        Parent parentObj = null;
        Child childObj = null;
        if (choice.equals("parent")) {
            parentObj = new Parent();
        } else if (choice.equals("child")) {
            childObj = new Child();
        } else {
            System.out.println("Invalid choice!");
            return;
        }
        System.out.println("\nCalling method of parent class by object of parent class:");
        if (parentObj != null) {
            parentObj.print();
        }
        System.out.println("\nCalling method of child class by object of child class:");
        if (childObj != null) {
            childObj.print();
        }
        System.out.println("\nCalling method of parent class by object of child class:");
        if (childObj != null) {
            childObj.print(); 
        }
        scanner.close();
    }
}
