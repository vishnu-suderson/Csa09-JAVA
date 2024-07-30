import java.util.Scanner;
public class PrimeAndCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeCount = 0;
        int compositeCount = 0;
        System.out.println("Enter the numbers (Enter -1 to stop):");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            if (isPrime(num)) {
                primeCount++;
            } else {
                compositeCount++;
            }
        }
        System.out.println("Prime numbers: " + primeCount);
        System.out.println("Composite numbers: " + compositeCount);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
