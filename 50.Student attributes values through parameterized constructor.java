import java.util.Scanner;
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }
        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Name should contain only alphabets.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter roll number:");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter course:");
        String course = scanner.nextLine();
        try {
            Student student = new Student(rollNo, name, age, course);
            System.out.println("\nStudent details:");
            student.display();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
