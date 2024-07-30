import java.util.Scanner;
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base (x): ");
        double x = scanner.nextDouble();
        System.out.println("Enter the exponent (n): ");
        int n = scanner.nextInt();
        double result = myPow(x, n);
        System.out.printf("Output: %.5f%n", result);
        scanner.close();
    }
    public static double myPow(double x, int n) {
        if (n == 0) return 1.0;
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1.0;
        double currentProduct = x;
        for (long i = N; i > 0; i /= 2) {
            if ((i % 2) == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
        }
        return result;
    }
}
