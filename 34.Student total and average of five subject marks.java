import java.util.Scanner;
class Student {
    private String name;
    private int registerNumber;
    private int[] marks = new int[5];
    public Student(String name, int registerNumber, int[] marks) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.marks = marks;
    }
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Subject Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average Marks: " + calculateAverage());
    }
    private int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    private double calculateAverage() {
        int total = calculateTotal();
        return (double) total / marks.length;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter register number: ");
        int registerNumber = scanner.nextInt();
        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        Student student = new Student(name, registerNumber, marks);
        System.out.println("\nStudent Details:");
        student.displayDetails();
        scanner.close();
    }
}
