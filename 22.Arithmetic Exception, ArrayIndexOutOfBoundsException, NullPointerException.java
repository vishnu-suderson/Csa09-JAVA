import java.util.Scanner;
public class MultiCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            System.out.print("Enter the index to access: ");
            int index = scanner.nextInt();
            array[index] = 100;
            System.out.println("Value at index " + index + ": " + array[index]);
            String str = null;
            System.out.println("Length of the string: " + str.length());
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception caught: " + e.toString());
        } finally {
            scanner.close();
            System.out.println("Resources have been closed.");
        }
    }
}
