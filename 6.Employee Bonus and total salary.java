import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade of the employee: ");
        String grade = scanner.next().toUpperCase();  
        System.out.print("Enter the employee salary: ");
        double salary;
        try {
            salary = Double.parseDouble(scanner.next());
            if (salary < 0) {
                System.out.println("Salary cannot be negative.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid salary input.");
            return;
        }
        if (!grade.equals("A") && !grade.equals("B")) {
            System.out.println("Invalid grade input. Valid grades are A and B.");
            return;
        }
        double bonus = 0.0;
        if (grade.equals("A")) {
            bonus = salary * 0.05;
        } else if (grade.equals("B")) {
            bonus = salary * 0.10;
        }
        if (salary < 10000) {
            bonus += salary * 0.02;
        }
        double totalSalary = salary + bonus;
        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total to be paid = " + totalSalary);
    }
}
