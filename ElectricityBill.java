import java.util.Scanner;
class ElectricityBill {
    private int consumerNo;
    private String consumerName;
    private int prevMonthReading;
    private int currMonthReading;
    private double billAmount;
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Consumer Number: ");
        consumerNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Consumer Name: ");
        consumerName = scanner.nextLine();
        System.out.print("Enter Previous Month Reading: ");
        prevMonthReading = scanner.nextInt();
        System.out.print("Enter Current Month Reading: ");
        currMonthReading = scanner.nextInt();
        scanner.close();
    }
    public void computeBill() {
        int unitsConsumed = currMonthReading - prevMonthReading;
        billAmount = calculateBill(unitsConsumed);
    }
    private double calculateBill(int units) {
        double amount = 0;
        if (units <= 100) {
            amount = units * 1.50;
        } else if (units <= 300) {
            amount = 100 * 1.50 + (units - 100) * 3.50;
        } else if (units <= 500) {
            amount = 100 * 1.50 + 200 * 3.50 + (units - 300) * 4.60;
        } else {
            amount = 100 * 1.50 + 200 * 3.50 + 200 * 4.60 + (units - 500) * 6.60;
        }
        return amount;
    }
    public void displayBill() {
        System.out.println("Electricity Bill");
        System.out.println("----------------");
        System.out.println("Consumer Number: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + prevMonthReading);
        System.out.println("Current Month Reading: " + currMonthReading);
        System.out.println("Units Consumed: " + (currMonthReading - prevMonthReading));
        System.out.println("Bill Amount: Rs. " + billAmount);
    }
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill();
        bill.inputDetails();
        bill.computeBill();
        bill.displayBill();
    }
}
