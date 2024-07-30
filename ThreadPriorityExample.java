import java.util.Scanner;
public class ThreadPriorityExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter priority for Thread-1 (1 to 10): ");
        int priority1 = scanner.nextInt();
        System.out.print("Enter priority for Thread-2 (1 to 10): ");
        int priority2 = scanner.nextInt();
        Thread thread1 = new Thread(new LowerPriorityThread(), "Thread-1");
        Thread thread2 = new Thread(new HigherPriorityThread(), "Thread-2");
        thread1.setPriority(priority1);
        thread2.setPriority(priority2);
        thread1.start();
        thread2.start();
        scanner.close();
    }
    static class LowerPriorityThread implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " started.");
            System.out.println(Thread.currentThread().getName() + " is running.");
            System.out.println(Thread.currentThread().getName() + " is completing its work.");
            System.out.println(Thread.currentThread().getName() + " finished.");
        }
    }
    static class HigherPriorityThread implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " started.");
            System.out.println(Thread.currentThread().getName() + " is running.");
            System.out.println(Thread.currentThread().getName() + " is completing its work.");
            System.out.println(Thread.currentThread().getName() + " finished.");
        }
    }
}
