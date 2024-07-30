import java.util.Scanner;
class Singleton {
    private static Singleton instance;
    private Singleton() {
    }
    public static Singleton getInstance() throws Exception {
        if (instance == null) {
            instance = new Singleton();
        } else {
            throw new Exception("Instance already created!");
        }
        return instance;
    }
}
public class SingletonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("Enter '1' to create a Singleton instance, '0' to exit:");
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    try {
                        Singleton instance = Singleton.getInstance();
                        System.out.println("Singleton instance created successfully.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    keepRunning = false;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid input. Please enter '1' to create instance or '0' to exit.");
            }
        }
        scanner.close();
    }
}
