import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Given Number: ");
        int number = scanner.nextInt();

        System.out.print("N = ");
        int N = scanner.nextInt();

        if (number == 0) {
            System.out.println("Number of factors = 1");
            System.out.println("1st factor of 0 = 0");
            return;
        }

        if (number < 0) {
            number = Math.abs(number);
        }

        int factorsCount = 0;
        int nthFactor = -1;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsCount++;
                if (factorsCount == N) {
                    nthFactor = i;
                    break;
                }
            }
        }

        System.out.println("Number of factors = " + factorsCount);
        if (N > factorsCount || N <= 0) {
            System.out.println("Invalid value of N.");
        } else {
            System.out.println(N + "th factor of " + number + " = " + nthFactor);
        }
    }
}
