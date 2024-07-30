import java.util.Scanner;
public class CompositeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int count = countCompositeNumbers(array);
        System.out.println("Number of Composite Numbers = " + count);

        scanner.close();
    }
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
    public static int countCompositeNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isComposite(num)) {
                count++;
            }
        }
        return count;
    }
}
