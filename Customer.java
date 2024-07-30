import java.util.Scanner;
class Customer {
    private int accountNo;
    private String accName;
    private double balance;
    public Customer(int accountNo, String accName, double balance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        notify();      
}
    public synchronized void withdraw(double amount) {
        while (amount > balance) {
            try {
                System.out.println("Insufficient balance. Waiting for deposit...");
                wait(); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        balance -= amount;     
   System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
    }
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer(123456, "John Doe", 10000);
        customer.displayBalance();
        System.out.print("Enter amount to withdraw: ");
        String withdrawInput = scanner.nextLine();
        System.out.print("Enter amount to deposit: ");
        String depositInput = scanner.nextLine();
        double withdrawAmount;
        double depositAmount;
        try {
            withdrawAmount = Double.parseDouble(withdrawInput);
            depositAmount = Double.parseDouble(depositInput);
            if (withdrawAmount < 0 || depositAmount < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter positive numbers.");
            return;
        }
        Thread withdrawThread = new Thread(() -> customer.withdraw(withdrawAmount));
        Thread depositThread = new Thread(() -> customer.deposit(depositAmount));
        withdrawThread.start();
        depositThread.start();
        try {
            withdrawThread.join();
            depositThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        customer.displayBalance();
    }
}
