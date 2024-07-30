import java.util.Scanner;
class Superclass {
    int num1;
    int num2;
    public Superclass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
class Subclass extends Superclass {
    public Subclass(int num1, int num2) {
        super(num1, num2);
    }
    public void displayValues() {
        System.out.println("Input values provided: " + num1 + ", " + num2);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        Subclass obj = new Subclass(num1, num2);
        obj.displayValues();
        scanner.close();
    }
}
