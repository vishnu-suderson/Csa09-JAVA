import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks in Python: ");
        int pythonMarks = scanner.nextInt();
        System.out.print("Enter the marks in C Programming: ");
        int cProgrammingMarks = scanner.nextInt();
        System.out.print("Enter the marks in Mathematics: ");
        int mathematicsMarks = scanner.nextInt();
        System.out.print("Enter the marks in Physics: ");
        int physicsMarks = scanner.nextInt();
        int total = pythonMarks + cProgrammingMarks + mathematicsMarks + physicsMarks;
        double aggregate = total / 4.0;
        String grade;
        if (aggregate > 75) {
            grade = "DISTINCTION";
        } else if (aggregate >= 60) {
            grade = "FIRST DIVISION";
        } else if (aggregate >= 50) {
            grade = "SECOND DIVISION";
        } else if (aggregate >= 40) {
            grade = "THIRD DIVISION";
        } else {
            grade = "FAIL";
        }
        System.out.println("Total = " + total);
        System.out.println("Aggregate = " + aggregate);
        System.out.println(grade);
    }
}
