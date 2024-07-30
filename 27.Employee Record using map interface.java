import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class EmployeeRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> employeeRecord = new HashMap<>();
        System.out.println("Enter employee ID:");
        int empId = scanner.nextInt();
        System.out.println("Enter employee name:");
        String empName = scanner.next();
        employeeRecord.put(empId, empName);
        System.out.println("Is the employee record empty? " + employeeRecord.isEmpty());
        System.out.println("Enter the employee ID to remove:");
        int idToRemove = scanner.nextInt();
        if (employeeRecord.containsKey(idToRemove)) {
            String removedEmpName = employeeRecord.remove(idToRemove);
            System.out.println("Removed employee: " + removedEmpName);
        } else {
            System.out.println("Employee with ID " + idToRemove + " not found.");
        }
        employeeRecord.clear();
        System.out.println("Employee record cleared.");
        scanner.close();
    }
}
