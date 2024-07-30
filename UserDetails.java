import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Total Users: ");
        int totalUsers = scanner.nextInt();


        System.out.print("Staff Users: ");
        int staffUsers = scanner.nextInt();

        if (totalUsers < 0 || staffUsers < 0) {
            System.out.println("Invalid input. Number of users cannot be negative.");
            return;
        }

        int studentUsers = totalUsers - staffUsers;


        int nonTeachingStaff = staffUsers / 3;

        staffUsers += nonTeachingStaff;

        System.out.println("Student Users: " + studentUsers);
    }
}
