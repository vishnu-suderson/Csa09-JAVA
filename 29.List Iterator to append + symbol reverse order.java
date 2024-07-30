import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
public class ListIteratorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.next());
        }
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + "+");
        }
        System.out.println("Elements in reverse order:");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        scanner.close();
    }
}
