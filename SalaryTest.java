import java.util.Scanner;
class Employee {
    private String name;
    private double basicSalary;
    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public double getSalary() {
        return basicSalary;
    }
}
class Manager extends Employee {
    private double travelAllowance;
    private double houseRentAllowance;
    public Manager(String name, double basicSalary, double travelAllowance, double houseRentAllowance) {
        super(name, basicSalary);
        this.travelAllowance = travelAllowance;
        this.houseRentAllowance = houseRentAllowance;
    }
    public double getSalary() {
        double totalSalary = super.getSalary() + travelAllowance + houseRentAllowance;
        return totalSalary;
    }
}
public class SalaryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Employee:");
        System.out.print("Name: ");
        String empName = scanner.nextLine();
        System.out.print("Basic Salary: ");
        double empBasicSalary = scanner.nextDouble();
        Employee emp = new Employee(empName, empBasicSalary);
        System.out.println("\nEnter details for Manager:");
        System.out.print("Name: ");
        scanner.nextLine();
        String managerName = scanner.nextLine();
        System.out.print("Basic Salary: ");
        double managerBasicSalary = scanner.nextDouble();
        System.out.print("Travel Allowance: ");
        double travelAllowance = scanner.nextDouble();
        System.out.print("House Rent Allowance: ");
        double houseRentAllowance = scanner.nextDouble();
        Manager manager = new Manager(managerName, managerBasicSalary, travelAllowance, houseRentAllowance);
        System.out.println("\nSalary of Employee " + empName + ": " + emp.getSalary());
        System.out.println("Salary of Manager " + managerName + ": " + manager.getSalary());
        scanner.close();
    }
}
