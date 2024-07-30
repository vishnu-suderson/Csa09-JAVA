import java.util.ArrayList;
import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        System.out.println("Enter -1 to exit...");
        while (true) {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            if (number > 0) {
                positiveNumbers.add(number);
            } else if (number < 0) {
                negativeNumbers.add(number);
            }
        }
        double positiveAverage = calculateAverage(positiveNumbers);
        double negativeAverage = calculateAverage(negativeNumbers);
        System.out.printf("The average of negative numbers is: %.2f%n", negativeAverage);
        System.out.printf("The average of positive numbers is: %.8f%n", positiveAverage);
    }
    private static double calculateAverage(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}
