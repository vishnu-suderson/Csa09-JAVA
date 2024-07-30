import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Scanner;
public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nHashtable Operations Menu");
            System.out.println("1. Add an element");
            System.out.println("2. Search for a key");
            System.out.println("3. Display all elements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    String key = scanner.nextLine();
                    System.out.print("Enter value: ");
                    String value = scanner.nextLine();
                    hashtable.put(key, value);
                    System.out.println("Element added successfully.");
                    break;
                case 2:
                    System.out.print("Enter key to search: ");
                    String searchKey = scanner.nextLine();
                    if (hashtable.containsKey(searchKey)) {
                        System.out.println("Key found. Value: " + hashtable.get(searchKey));
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;                    
                case 3:
                    Enumeration<String> keys = hashtable.keys();
                    System.out.println("Hashtable elements:");
                    while (keys.hasMoreElements()) {
                        String k = keys.nextElement();
                        System.out.println("Key: " + k + ", Value: " + hashtable.get(k));
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
