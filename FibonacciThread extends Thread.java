import java.util.Scanner;
class FibonacciThread extends Thread {
    public void run() {
        int n1 = 0, n2 = 1, n3;
        System.out.println("Fibonacci Series:");
        System.out.print(n1 + " " + n2); 
        for (int i = 2; i < 10; ++i) { 
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println(); 
    }
}
class ReverseThread extends Thread {
    public void run() {
        System.out.println("Numbers in Reverse Order:");
        for (int i = 10; i >= 1; --i) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to start the Fibonacci thread? (yes/no)");
        String fibonacciInput = scanner.nextLine();
        System.out.println("Do you want to start the Reverse thread? (yes/no)");
        String reverseInput = scanner.nextLine();
        if (fibonacciInput.equalsIgnoreCase("yes")) {
            FibonacciThread fibonacciThread = new FibonacciThread();
            fibonacciThread.start();
        }
        if (reverseInput.equalsIgnoreCase("yes")) {
            ReverseThread reverseThread = new ReverseThread();
            reverseThread.start();
        }
        scanner.close();
    }
}
