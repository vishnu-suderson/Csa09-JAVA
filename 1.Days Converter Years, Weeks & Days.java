import java.util.Scanner;
public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();
        scanner.close();
        if (totalDays >= 0) {
            int years = totalDays / 365;
            int remainingDays = totalDays % 365;
            int weeks = remainingDays / 7;
            int days = remainingDays % 7;
            System.out.println("No. of years: " + years);
            System.out.println("No. of weeks: " + weeks);
            System.out.println("No. of days: " + days);
        } else {
            System.out.println("Invalid input. Number of days cannot be negative.");
        }
    }
}
