import java.util.Scanner;
import java.util.Vector;
class Student1 {
    String name;
    int rollNumber;
    String department;
    String course;
    String contactInfo;
    public Student(String name, int rollNumber, String department, String course, String contactInfo) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
        this.course = course;
        this.contactInfo = contactInfo;
    }
    public String toString() {
        return "Student Name: " + name + ", Roll Number: " + rollNumber + ", Department: " + department + ", Course: " + course + ", Contact Info: " + contactInfo;
    }
}
public class StudentInformationSystem {
    private static Vector<Student> students = new Vector<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Insert Student Record");
            System.out.println("2. Retrieve Student Record");
            System.out.println("3. Remove Student Record");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    insertStudent(scanner);
                    break;
                case 2:
                    retrieveStudent(scanner);
                    break;
                case 3:
                    removeStudent(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void insertStudent(Scanner scanner) {
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        System.out.print("Enter Contact Information: ");
        String contactInfo = scanner.nextLine();
        Student student = new Student(name, rollNumber, department, course, contactInfo);
        students.add(student);
        System.out.println("Student record inserted successfully.");
    }
    private static void retrieveStudent(Scanner scanner) {
        System.out.print("Enter Roll Number to Retrieve: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); 
        for (Student student : students) {
            if (student.rollNumber == rollNumber) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }
    private static void removeStudent(Scanner scanner) {
        System.out.print("Enter Roll Number to Remove: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); 
        for (Student student : students) {
            if (student.rollNumber == rollNumber) {
                students.remove(student);
                System.out.println("Student record removed successfully.");
                return;
            }
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }
}
