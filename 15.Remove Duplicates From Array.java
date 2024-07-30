import java.util.ArrayList;
import java.util.Scanner;
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Non-duplicate items:");
        System.out.println(java.util.Arrays.toString(uniqueArray));
    }
    public static int[] removeDuplicates(int[] array) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int num : array) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }
        return uniqueArray;
    }
}
