import java.util.Scanner;
class FibonacciGenerator implements Runnable {
    private int n;
    public FibonacciGenerator(int n) {
        this.n = n;
    }
    public void run() {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the Fibonacci series: ");
        int n = scanner.nextInt();
        FibonacciGenerator generator = new FibonacciGenerator(n);
        Thread thread = new Thread(generator);
        thread.start();
        scanner.close();
    }
}
