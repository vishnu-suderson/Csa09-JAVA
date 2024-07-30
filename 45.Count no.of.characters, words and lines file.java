import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the file: ");
        String filePath = scanner.nextLine();
        scanner.close();
        try {
            int[] counts = countFileStatistics(filePath);
            System.out.println("Number of characters: " + counts[0]);
            System.out.println("Number of words: " + counts[1]);
            System.out.println("Number of lines: " + counts[2]);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    public static int[] countFileStatistics(String filePath) throws IOException {
        int[] counts = new int[3]; 
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                counts[0] += line.length(); 
                counts[1] += line.split("\\s+").length; 
                counts[2]++;
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return counts;
    }
}
