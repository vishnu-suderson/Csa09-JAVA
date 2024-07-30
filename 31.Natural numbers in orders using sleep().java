import java.util.Scanner;
class NumberPrinter implements Runnable {
    private static final Object lock = new Object();
    private static int currentNumber = 1;
    private int maxNumber;
    private int threadId;
    private static int currentThreadId = 1;
    public NumberPrinter(int maxNumber, int threadId) {
        this.maxNumber = maxNumber;
        this.threadId = threadId;
    }
    public void run() {
        try {
            while (true) {
                synchronized (lock) {
                    while (currentThreadId != threadId) {
                        lock.wait();
                    }
                    if (currentNumber > maxNumber) {
                        break;
                    }
                    System.out.println("Thread " + threadId + ": " + currentNumber++);
                    currentThreadId = currentThreadId % 3 + 1;
                    lock.notifyAll();
                }
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number to print: ");
        int maxNumber = scanner.nextInt();
        Thread thread1 = new Thread(new NumberPrinter(maxNumber, 1));
        Thread thread2 = new Thread(new NumberPrinter(maxNumber, 2));
        Thread thread3 = new Thread(new NumberPrinter(maxNumber, 3));
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        scanner.close();
    }
}
