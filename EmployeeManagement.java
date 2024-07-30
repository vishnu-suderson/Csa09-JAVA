import java.util.ArrayList;
import java.util.Scanner;
class Employee3 {
    private String name;
    private int id;
    private double salary;
    private double pf;
    private double allowance;
    public Employee(String name, int id, double salary, double pf, double allowance) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.pf = pf;
        this.allowance = allowance;
    }
    public int getId() {
        return id;
    }
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", pf=" + pf +
                ", allowance=" + allowance +
                '}';
    }
}
public class EmployeeManagement {
    private static ArrayList<Employee> employees = new ArrayList<>();
    public static void addEmployee(Scanner scanner) {
        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Employee ID:");
        int id = scanner.nextInt();
        System.out.println("Enter Employee Salary:");
        double salary = scanner.nextDouble();
        System.out.println("Enter Employee PF:");
        double pf = scanner.nextDouble();
        System.out.println("Enter Employee Allowance:");
        double allowance = scanner.nextDouble();
        scanner.nextLine(); 
        Employee employee = new Employee(name, id, salary, pf, allowance);
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }
    public static void retrieveEmployee(Scanner scanner) {
        System.out.println("Enter Employee ID to retrieve:");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    public static void removeEmployee(Scanner scanner) {
        System.out.println("Enter Employee ID to remove:");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                System.out.println("Employee removed successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Retrieve Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); import java.util.Hashtable;
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

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    retrieveEmployee(scanner);
                    break;
                case 3:
                    removeEmployee(scanner);
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
