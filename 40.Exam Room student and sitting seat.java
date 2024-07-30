import java.util.Scanner;
import java.util.TreeSet;
class ExamRoom {
    private int n;
    private TreeSet<Integer> seats;
    public ExamRoom(int n) {
        this.n = n;
        this.seats = new TreeSet<>();
    }
    public int seat() {
        if (seats.isEmpty()) {
            seats.add(0);
            return 0;
        }
        int maxDist = seats.first();
        int prev = -1;
        int studentSeat = 0;
        for (int seat : seats) {
            if (prev != -1) {
                int dist = (seat - prev) / 2;
                if (dist > maxDist) {
                    maxDist = dist;
                    studentSeat = prev + dist;
                }
            }
            prev = seat;
        }
        if (n - 1 - seats.last() > maxDist) {
            studentSeat = n - 1;
        }
        seats.add(studentSeat);
        return studentSeat;
    }
    public void leave(int p) {
        seats.remove(p);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of seats in the exam room:");
        int n = scanner.nextInt();
        ExamRoom examRoom = new ExamRoom(n);
        while (true) {
            System.out.println("Enter '1' to seat a student, '2' for a student to leave, or '0' to exit:");
            int choice = scanner.nextInt();
            if (choice == 1) {
                int seatNumber = examRoom.seat();
                System.out.println("Student seated at: " + seatNumber);
            } else if (choice == 2) {
                System.out.println("Enter the seat number to be vacated:");
                int seatNumber = scanner.nextInt();
                examRoom.leave(seatNumber);
                System.out.println("Seat " + seatNumber + " vacated.");
            } else if (choice == 0) {
                System.out.println("Exiting program.");
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
        scanner.close();
    }
}
