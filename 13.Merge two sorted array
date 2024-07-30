import java.util.ArrayList;
import java.util.Scanner;
public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of elements in the second array:\n ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        ArrayList<Integer> mergedList = mergeSortedArrays(arr1, arr2);
        int[] arr3 = mergedList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Merged array:");
        for (int i : arr3) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
    public static ArrayList<Integer> mergeSortedArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedList.add(arr1[i]);
                i++;
            } else {
                mergedList.add(arr2[j]);
                j++;
            }
        }
        while (i < arr1.length) {
            mergedList.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            mergedList.add(arr2[j]);
            j++;
        }
        return mergedList;
    }
}
