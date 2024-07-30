import java.util.Scanner;
class MultiplicationTable extends Thread {
    private int number;
    public MultiplicationTable(int number) {
        this.number = number;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        MultiplicationTable table1 = new MultiplicationTable(num1);
        MultiplicationTable table2 = new MultiplicationTable(num2);
        table1.start();
        table2.start();
        scanner.close();
    }
}
