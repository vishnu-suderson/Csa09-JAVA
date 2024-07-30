import java.util.Scanner;

class Addition implements Runnable {
    private double num1, num2;

    public Addition(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run() {
        double result = num1 + num2;
        System.out.println("Addition Result: " + result);
    }
}

class Subtraction implements Runnable {
    private double num1, num2;

    public Subtraction(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run() {
        double result = num1 - num2;
        System.out.println("Subtraction Result: " + result);
    }
}

class Multiplication implements Runnable {
    private double num1, num2;

    public Multiplication(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void run() {
        double result = num1 * num2;
        System.out.println("Multiplication Result: " + result);
    }
}

class Division implements Runnable {
    private double num1, num2;

    public Division(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Division Result: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        Thread additionThread = new Thread(new Addition(num1, num2));
        Thread subtractionThread = new Thread(new Subtraction(num1, num2));
        Thread multiplicationThread = new Thread(new Multiplication(num1, num2));
        Thread divisionThread = new Thread(new Division(num1, num2));

        additionThread.start();
        subtractionThread.start();
        multiplicationThread.start();
        divisionThread.start();

        try {
            additionThread.join();
            subtractionThread.join();
            multiplicationThread.join();
            divisionThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
