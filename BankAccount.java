import java.util.Scanner;
class BankAccount {
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;
    public BankAccount() {

        this.balance = 10000;
    }
    public void readAccountDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        this.accountNumber = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter Depositor Name: ");
        this.depositorName = scanner.nextLine();
        System.out.print("Enter Account Type (Savings/Current): ");
        this.accountType = scanner.nextLine();
    }
    public void depositAmount(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdrawAmount(double amount) {
        if (amount > 0 && this.balance - amount >= 500) {
            this.balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    public void displayBalance() {
        System.out.println("Balance: Rs. " + this.balance);
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Depositor Name: " + this.depositorName);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Balance: Rs. " + this.balance);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
        account.readAccountDetails();
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display Account Details");
            System.out.println("2. Display Balance");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Withdraw Amount");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    account.displayAccountDetails();
                    break;
                case 2:
                    account.displayBalance();
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.depositAmount(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdrawAmount(withdrawAmount);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
