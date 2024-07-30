import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array (n-1): ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array (n-1 elements): ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int missingNumber = findMissingNumber(array, size + 1);
        System.out.println("The missing number is: " + missingNumber);

        scanner.close();
    }
    public static int findMissingNumber(int[] array, int n) {
        int totalXOR = 0;
        for (int i = 1; i <= n; i++) {
            totalXOR ^= i;
        }
        int arrayXOR = 0;
        for (int num : array) {
            arrayXOR ^= num;
        }
        return totalXOR ^ arrayXOR;
    }
}
