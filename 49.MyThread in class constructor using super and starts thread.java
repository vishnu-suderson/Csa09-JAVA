import java.util.Scanner;
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println("Thread " + getName() + " started.");
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            System.out.println("Thread " + getName() + " interrupted.");
            return;
        }
        System.out.println("Thread " + getName() + " finished.");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name for the thread:");
        String threadName = scanner.nextLine();
        System.out.println("Main thread started.");
        MyThread thread1 = new MyThread(threadName);
        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread continues its execution while child thread is running.");
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread finished.");
        scanner.close();
    }
}
