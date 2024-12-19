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

//    public String getCellData(String sheetName, int row, int column) {
//        Sheet sheet = workbook.getSheet(sheetName);
//        Row rowObj = sheet.getRow(row);
//        Cell cell = rowObj.getCell(column);
//        return cell.toString();
//    }
    public String getCellData(String sheetName, int rowNum, int colNum) {
        try {
            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new RuntimeException("Sheet not found: " + sheetName);
            }

            Row row = sheet.getRow(rowNum);
            if (row == null) {
                return ""; // Return empty string if row is null
            }

            Cell cell = row.getCell(colNum);
            if (cell == null) {
                return ""; // Return empty string if cell is null
            }

            // Handle different cell types
            switch (cell.getCellType()) {
                case STRING:
                    return cell.getStringCellValue();
                case NUMERIC:
                    return String.valueOf((int) cell.getNumericCellValue());
                case BOOLEAN:
                    return String.valueOf(cell.getBooleanCellValue());
                case BLANK:
                    return ""; // Return empty string for blank cells
                default:
                    return ""; // Default case for unsupported types
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
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

   
	


