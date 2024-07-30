import java.util.ArrayList;
import java.util.Scanner;
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        String input = scanner.next();
        try {
            int n = Integer.parseInt(input);
            if (n <= 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
            } else {
                ArrayList<Integer> perfectNumbers = findPerfectNumbers(n);
                System.out.println("First " + n + " perfect numbers are: " + perfectNumbers);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
    }
    public static ArrayList<Integer> findPerfectNumbers(int n) {
        ArrayList<Integer> perfectNumbers = new ArrayList<>();
        int number = 1;
        while (perfectNumbers.size() < n) {
            if (isPerfect(number)) {
                perfectNumbers.add(number);
            }
            number++;
        }

        return perfectNumbers;
    }
    public static boolean isPerfect(int number) {
        int sum = 1; 
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number && number != 1;
    }
}
