import java.util.Scanner;
interface IterF1 {
    void add(int a, int b);
    void sub(int a, int b);
}
class Calculator implements IterF1 {
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }
    public void sub(int a, int b) {
        int diff = a - b;
        System.out.println("Difference of " + a + " and " + b + " is: " + diff);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();
        Calculator calc = new Calculator();
        calc.add(num1, num2);
        calc.sub(num1, num2);
    }
}
