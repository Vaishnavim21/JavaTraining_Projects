package com.example.export2.serviceImplementation;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.example.export2.entity.TutorialEntity;
import com.example.export2.service.TutorialService;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class TutorialImplementation extends TutorialService {
    public void excelGenerate(List<TutorialEntity> listTutorial) throws IOException {
        try (XSSFWorkbook workbook = new XSSFWorkbook()) {
            XSSFSheet sheet = workbook.createSheet("List Tutorials");
            Row headerRow = sheet.createRow(0);
            
            XSSFFont font = workbook.createFont();
            
            font.setFontHeightInPoints((short) 10);
            font.setFontName("Verdana");
            font.setColor(IndexedColors.BLACK.getIndex());
            font.setBold(true);
            font.setItalic(false);

            // Create a CellStyle with background color
            XSSFCellStyle style = workbook.createCellStyle();
            style.setFillBackgroundColor(IndexedColors.YELLOW.getIndex());
            style.setFillPattern(FillPatternType.DIAMONDS);
            style.setFillForegroundColor(IndexedColors.RED.getIndex());
            style.setFont(font);

            int headCellCount = 0;
            createCell(headerRow, sheet, headCellCount++, "id", style);
            createCell(headerRow, sheet, headCellCount++, "title", style);
            createCell(headerRow, sheet, headCellCount++, "description", style);
            createCell(headerRow, sheet, headCellCount++, "published", style);

            headCellCount = 0;
            int rowCount = 1;
            for (TutorialEntity tutorials : listTutorial) {
                headerRow = sheet.createRow(rowCount);
                headCellCount = 0;
                createCell(headerRow, sheet, headCellCount++, tutorials.getId(), null);
                createCell(headerRow, sheet, headCellCount++, tutorials.getTitle(), null);
                createCell(headerRow, sheet, headCellCount++, tutorials.getDescription(), null);
                createCell(headerRow, sheet, headCellCount++, tutorials.isPublished(), null);
                rowCount++;
            }
            
            sheet.addMergedRegion(new CellRangeAddress(1, // first row (0-based)
                    1, // last row (0-based)
                    2, // first column (0-based)
                    3 // last column (0-based)
            ));
     

            File f1 = new File("D:/Report/" + "tutorials.xlsx");
            FileOutputStream output = new FileOutputStream(f1);
            workbook.write(output);
            output.close();
        }
    }

    private void createCell(Row row, XSSFSheet sheet, int columnCount, Object value, CellStyle style) {
        sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        } else {
            cell.setCellValue(value.toString());
        }
        if (style != null) {
            cell.setCellStyle(style);
        }
    }
}
