import java.util.HashMap;
import java.util.Scanner;
class Bank {
    private HashMap<String, Double> interestRates;
    public Bank() {
        interestRates = new HashMap<>();
        interestRates.put("SBI", 8.4);
        interestRates.put("ICICI", 7.3);
        interestRates.put("AXIS", 9.7);
    }
    public double getInterestRate(String bankName) {
        return interestRates.getOrDefault(bankName, 0.0);
    }
}
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the bank name: ");
        String bankName = scanner.nextLine().toUpperCase();
        double interestRate = bank.getInterestRate(bankName);
        if (interestRate != 0.0) {
            System.out.println("Interest Rate for " + bankName + " bank is: " + interestRate + "%");
        } else {
            System.out.println("Sorry, we don't have information about the interest rate for " + bankName + " bank.");
        }
        scanner.close();
    }
}
