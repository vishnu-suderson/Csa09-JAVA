import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N = ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Invalid input. N should be a positive integer greater than 0.");
            return;
        }

        int primeCount = 0;
        int num = 2;
        int nthPrime = 0;

        while (primeCount < N) {
            if (isPrime(num)) {
                primeCount++;
                nthPrime = num;
            }
            num++;
        }

        System.out.println(N + "th Prime number is " + nthPrime);

        System.out.print(N + " prime numbers after " + nthPrime + " are: ");
        int count = 0;
        while (count < N) {
            nthPrime++;
            if (isPrime(nthPrime)) {
                System.out.print(nthPrime);
                if (count < N - 1) {
                    System.out.print(", ");
                }
                count++;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
