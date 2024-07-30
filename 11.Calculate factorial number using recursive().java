import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        long factorial = calculateFactorial(n);
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * calculateFactorial(n - 1); 
        }
    }
}
