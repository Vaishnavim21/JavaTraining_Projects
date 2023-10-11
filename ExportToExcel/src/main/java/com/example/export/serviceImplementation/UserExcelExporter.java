package com.example.export.serviceImplementation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.example.export.entity.UserEntity;

@Service
public class UserExcelExporter {

	public void excelGenerate(List<UserEntity> listUsers) throws IOException {

		try (XSSFWorkbook workbook = new XSSFWorkbook()) {
			XSSFSheet sheet = workbook.createSheet("List Users");
			Row headerRow = sheet.createRow(0);
			int headCellCount = 0;
			createCell(headerRow, sheet, headCellCount++, "id", null);
			createCell(headerRow, sheet, headCellCount++, "name", null);

			headCellCount = 0;
			int rowCount = 1;
			headerRow = sheet.createRow(rowCount);
			for (UserEntity users : listUsers) {
				headCellCount = 0;
				createCell(headerRow, sheet, headCellCount++, users.getId(), null);
				createCell(headerRow, sheet, headCellCount++, users.getFullName(), null);
				rowCount++;
			}

			File f1 = new File("D:/Report/" + "users.xlsx");
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
			cell.setCellValue((String) value);
		}
		cell.setCellStyle(style);
	}

}