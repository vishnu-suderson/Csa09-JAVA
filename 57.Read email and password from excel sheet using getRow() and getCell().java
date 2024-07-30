import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadExcel {
    public static void main(String[] args) {
        String excelFilePath = "credentials.xlsx";
        try (FileInputStream fileInputStream = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(1);
            String email = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
