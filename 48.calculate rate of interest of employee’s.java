import java.util.Scanner;
public class ProvidentFundCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the employee's basic salary: ");
            double basicSalary = scanner.nextDouble();
            double interestRate = calculateInterestRate(basicSalary);
            System.out.println("The rate of interest for the employee's Provident Fund is: " + interestRate + "%");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    public static double calculateInterestRate(double basicSalary) {
        if (basicSalary <= 0) {
            throw new IllegalArgumentException("Basic salary must be greater than zero.");
        }
        double interestRate;
        if (basicSalary <= 10000) {
            interestRate = 8.0;
        } else if (basicSalary <= 20000) {
            interestRate = 9.0;
        } else {
            interestRate = 10.0;
        }
        return interestRate;
    }
}
