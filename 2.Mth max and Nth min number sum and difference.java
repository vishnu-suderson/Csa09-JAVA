import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int length = scanner.nextInt();
        Integer[] array = new Integer[length];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of M (for Mth maximum number): ");
        int M = scanner.nextInt();
        System.out.print("Enter the value of N (for Nth minimum number): ");
        int N = scanner.nextInt();
        int mthMax = findMthMax(array, M);
        int nthMin = findNthMin(array, N);
        int sum = mthMax + nthMin;
        int difference = mthMax - nthMin;
        System.out.println(M + "th Maximum Number = " + mthMax);
        System.out.println(N + "th Minimum Number = " + nthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
    }
    public static int findMthMax(Integer[] array, int M) {
        Arrays.sort(array, Collections.reverseOrder());
        return array[M - 1];
    }
    public static int findNthMin(Integer[] array, int N) {
        Arrays.sort(array);
        return array[N - 1];
    }
}
