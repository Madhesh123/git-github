package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetValue {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Mahesh\\eclipse-workspace\\Framework1\\testdata\\Book2.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		System.out.println(cell);
		
		if (cell.equals("Selenium")) {
			//cell.setCellValue("Selenium");	
			System.out.println("done my statement");
		}else {
			
			System.out.println("Not Done");
		}
//			
//		FileOutputStream m = new FileOutputStream(f);
//		workbook.write(m);
	}
	
}
