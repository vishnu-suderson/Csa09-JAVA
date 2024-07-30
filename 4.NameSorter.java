import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        System.out.println("Enter names (type 'done' when finished):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            names.add(name);
        }
        System.out.println("Sort in ascending or descending order? (asc/desc):");
        String sortOrder = scanner.nextLine();
        if (sortOrder.equalsIgnoreCase("asc")) {
            Collections.sort(names);
        } else if (sortOrder.equalsIgnoreCase("desc")) {
            Collections.sort(names, Comparator.reverseOrder());
        } else {
            System.out.println("Invalid sort order. Defaulting to ascending order.");
            Collections.sort(names);
        }
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
        scanner.close();
    }
}
