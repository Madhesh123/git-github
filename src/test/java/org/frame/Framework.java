package org.frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framework {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Mahesh\\eclipse-workspace\\Framework1\\target\\Book12.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(stream);
		
		Sheet sheet = w.getSheet("Datas");
		
		Row row = sheet.getRow(3);
		
		Cell cell = row.getCell(1);
		System.out.println(cell);
		int count = sheet.getPhysicalNumberOfRows();
		System.out.println(count);
		
		
		
		
//		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		
		
		
		
		
		
		
//		
//		driver.get("https://adactinhotelapp.com/");
//		
//		String stringCellValue = cell.getStringCellValue();
//		   System.out.println(stringCellValue);
//		   
//		   driver.findElement(By.id("username")).sendKeys(stringCellValue);
//	
	}

}
