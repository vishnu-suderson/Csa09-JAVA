import java.util.ArrayList;
import java.util.Scanner;
public class PerfectSquareWithSumLessThanTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int lowerRange = scanner.nextInt();
        System.out.print("Enter upper range: ");
        int upperRange = scanner.nextInt();

        if (lowerRange >= upperRange) {
            System.out.println("Invalid input. Upper range should be greater than lower range.");
            return;
        }

        ArrayList<Integer> perfectSquaresWithSumLessThanTen = new ArrayList<>();


        for (int i = lowerRange; i <= upperRange; i++) {
            if (isPerfectSquare(i) && sumOfDigits(i) < 10) {
                perfectSquaresWithSumLessThanTen.add(i);
            }
        }

        System.out.println(perfectSquaresWithSumLessThanTen);
    }

    public static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
