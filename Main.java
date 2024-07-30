import java.util.Scanner;
interface Marks {
    void inputMarks();
    void displayMarks();
}
interface Calculate {
    void calculateTotal();
    void calculateAggregate();
    void displayTotalAndAggregate();
}
class Student implements Marks, Calculate {
    private int[] marks = new int[6];
    private int total;
    private float aggregate;
    private String grade;
    private String[] subjects = {"Python", "C Programming", "Mathematics", "Physics", "Chemistry", "Professional Ethics"};
    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks for six subjects:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter the marks in " + subjects[i] + ": ");
            marks[i] = scanner.nextInt();
        }
    }
    public void displayMarks() {
        System.out.println("Marks in six subjects:");
        for (int i = 0; i < 6; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
    }
    public void calculateTotal() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
    }
    public void calculateAggregate() {
        aggregate = total / 6.0f;
    }
    public void displayTotalAndAggregate() {
        System.out.println("Total Marks: " + total);
        System.out.println("Aggregate: " + aggregate + "%");
    }
    public void determineGrade() {
        if (aggregate > 75) {
            grade = "Distinction";
        } else if (aggregate > 60) {
            grade = "First Division";
        } else if (aggregate > 50) {
            grade = "Second Division";
        } else if (aggregate > 40) {
            grade = "Third Division";
        } else {
            grade = "FAIL";
        }
        System.out.println("Grade: " + grade);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.inputMarks();
        student.displayMarks();
        student.calculateTotal();
        student.calculateAggregate();
        student.displayTotalAndAggregate();
        student.determineGrade();
    }
}
