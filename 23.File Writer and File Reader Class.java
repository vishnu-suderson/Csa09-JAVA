import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileReadWriteExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to write to the file:");
        String inputString = scanner.nextLine();
        String fileName = "example.txt";
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(inputString);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        try (FileReader fileReader = new FileReader(fileName)) {
            int character;
            System.out.println("Reading from the file:");
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
        scanner.close();
    }
}
