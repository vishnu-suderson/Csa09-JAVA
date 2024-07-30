import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        List<Integer> commonElements = findCommonElements(array1, array2);
        System.out.println("Common elements:");
        for (int element : commonElements) {
            System.out.print(element + " ");
        }
    }
    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        for (int element : array1) {
            set.add(element);
        }
        List<Integer> commonElements = new ArrayList<>();
        for (int element : array2) {
            if (set.contains(element)) {
                commonElements.add(element);
                // Remove the element from the set to avoid duplicates in the result
                set.remove(element);
            }
        }
        return commonElements;
    }
}
