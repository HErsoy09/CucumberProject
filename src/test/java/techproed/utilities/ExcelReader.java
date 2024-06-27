package techproed.utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    Workbook workbook;
    Sheet sheet;

    //Bu classtan object olusturmamizin amaci excel dosyasini okumaktir
    public ExcelReader(String path, String pageName) {
        try {
            FileInputStream fis = new FileInputStream(path);
            workbook = WorkbookFactory.create(fis);
            sheet = workbook.getSheet(pageName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Satir ve sutun indexlerini girerek ilgili cell datasini string olarak return eder
    public String getCellData(int row, int column) {
        Cell cell = sheet.getRow(row).getCell(column);
        return cell.toString();
    }

    public int rowCount() {
        return sheet.getLastRowNum();
    }
}