import marks.Student;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        Student student = new Student(name, rollNumber, marks);
        System.out.println("\nStudent Details:");
        student.display();
        int totalMarks = student.calculateTotalMarks();
        double percentage = student.calculatePercentage();
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        scanner.close();
    }
}
