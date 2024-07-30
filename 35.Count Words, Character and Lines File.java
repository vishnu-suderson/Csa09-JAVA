import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;
public class FileStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            long wordCount = reader.lines()
                                   .flatMap(line -> Stream.of(line.split("\\s+")))
                                   .count();
            long charCount = reader.lines()
                                   .mapToInt(String::length)
                                   .sum();         
            long lineCount = reader.lines().count();
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of lines: " + lineCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
