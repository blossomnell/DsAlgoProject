package Utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    private Workbook workbook;

    public ExcelReader(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        workbook = new XSSFWorkbook(fis);
    }

    public String getCellData(String sheetName, int row, int column) {
        Sheet sheet = workbook.getSheet(sheetName);
        Row rowObj = sheet.getRow(row);
        Cell cell = rowObj.getCell(column);
        return cell.toString();
    }

    public int getRowCount(String sheetName) {
        Sheet sheet = workbook.getSheet(sheetName);
        return sheet.getLastRowNum() + 1;
    }

    public int getColumnCount(String sheetName, int rowIndex) {
        Row row = workbook.getSheet(sheetName).getRow(rowIndex);
        return row.getLastCellNum();
    }

    public void closeWorkbook() throws IOException {
        workbook.close();
    }
}

   
	


