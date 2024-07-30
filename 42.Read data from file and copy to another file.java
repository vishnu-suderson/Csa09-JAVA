import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the source file: ");
        String sourceFilePath = scanner.nextLine();
        System.out.print("Enter the path of the destination file: ");
        String destinationFilePath = scanner.nextLine();
        scanner.close();
        try {
            copyFile(sourceFilePath, destinationFilePath);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    public static void copyFile(String sourceFilePath, String destinationFilePath) throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(sourceFilePath));
            writer = new BufferedWriter(new FileWriter(destinationFilePath));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
