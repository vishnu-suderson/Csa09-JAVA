import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        if (N >= 0) {
            int factorial = calculateFactorial(N);
            System.out.println(N + " Factorial = " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        scanner.close();
    }
    public static int calculateFactorial(int N) {
        if (N == 0 || N == 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = 2; i <= N; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
