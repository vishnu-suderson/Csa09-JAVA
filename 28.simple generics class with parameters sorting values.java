import java.util.Arrays;
import java.util.Scanner;
public class GenericSort<T extends Comparable<T>> {
    private T[] array;
    public GenericSort(T[] array) {
        this.array = array;
    }
    public void sort() {
        Arrays.sort(array);
    }
    public void printArray() {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        Integer[] intArray = new Integer[size];
        Double[] doubleArray = new Double[size];
        String[] stringArray = new String[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            intArray[i] = scanner.nextInt();
        }
        System.out.println("Enter " + size + " doubles:");
        for (int i = 0; i < size; i++) {
            doubleArray[i] = scanner.nextDouble();
        }
        System.out.println("Enter " + size + " strings:");
        for (int i = 0; i < size; i++) {
            stringArray[i] = scanner.next();
        }
        GenericSort<Integer> intSort = new GenericSort<>(intArray);
        GenericSort<Double> doubleSort = new GenericSort<>(doubleArray);
        GenericSort<String> stringSort = new GenericSort<>(stringArray);
        System.out.println("Original Integer array:");
        intSort.printArray();
        intSort.sort();
        System.out.println("Sorted Integer array:");
        intSort.printArray();
        System.out.println("Original Double array:");
        doubleSort.printArray();
        doubleSort.sort();
        System.out.println("Sorted Double array:");
        doubleSort.printArray();
        System.out.println("Original String array:");
        stringSort.printArray();
        stringSort.sort();
        System.out.println("Sorted String array:");
        stringSort.printArray();
        scanner.close();
    }
}
