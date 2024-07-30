import java.util.Scanner;
public class StepsToReduceToZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int steps = numberOfSteps(num);
        System.out.println("The number of steps to reduce " + num + " to zero is: " + steps);
        scanner.close();
    }
    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }        
        return steps;
    }
}
