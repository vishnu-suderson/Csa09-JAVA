import java.util.Scanner;
class Date {
    private int day;
    private int month;
    private int year;
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public String displayDate() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
class Student {
    private int id;
    private String name;
    private Date dateOfBirth;
    private int[] marks = new int[3];
    public Student(int id, String name, Date dateOfBirth, int mark1, int mark2, int mark3) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.marks[0] = mark1;
        this.marks[1] = mark2;
        this.marks[2] = mark3;
    }
    public void displayStudentDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth.displayDate());
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("  Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Date of Birth (day month year): ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        Date dob = new Date(day, month, year);
        System.out.print("Enter marks for 3 subjects: ");
        int mark1 = scanner.nextInt();
        int mark2 = scanner.nextInt();
        int mark3 = scanner.nextInt();
        Student student = new Student(id, name, dob, mark1, mark2, mark3);
        student.displayStudentDetails();
        scanner.close();
    }
}
