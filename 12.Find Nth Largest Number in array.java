import java.util.Arrays;
import java.util.Scanner;
public class NthLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        int nthLargest = findNthLargest(list, n);
        System.out.println(n + "th Largest number: " + nthLargest);
    }
    public static int findNthLargest(int[] arr, int n) {
        Arrays.sort(arr);
        int length = arr.length;
        if (n > 0 && n <= length) {
            return arr[length - n];
        } else {
            return Integer.MIN_VALUE;
        }
    }
}
