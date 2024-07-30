import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileCopyUsingFileReaderWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the source file: ");
        String sourceFilePath = scanner.nextLine();
        System.out.print("Enter the path of the destination file: ");
        String destinationFilePath = scanner.nextLine();
        scanner.close();
        try {
            copyFileUsingFileReaderWriter(sourceFilePath, destinationFilePath);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    public static void copyFileUsingFileReaderWriter(String sourceFilePath, String destinationFilePath) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader(sourceFilePath);
            writer = new FileWriter(destinationFilePath);
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
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
