package org.webtable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Mahesh\\OneDrive\\Pictures\\jeeva\\morning2.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		WebElement table = driver.findElement(By.tagName("table"));
		WebElement heading = table.findElement(By.tagName("thead"));
		WebElement headingrow = heading.findElement(By.tagName("tr"));
		List<WebElement> data = headingrow.findElements(By.tagName("th"));
			Row row = sheet.createRow(0);
		for (int i = 0; i < data.size(); i++) {
				Cell cell = row.createCell(i);
				WebElement webElement = data.get(i);
				String text = webElement.getText();
				cell.setCellValue(text);
				
			}
		WebElement body = table.findElement(By.tagName("tbody"));
		List<WebElement> bodyRows = body.findElements(By.tagName("tr"));
		for (int i = 0; i < bodyRows.size(); i=i+2) {
			WebElement rows = bodyRows.get(i);
			List<WebElement> rowsData = rows.findElements(By.tagName("td"));
			Row rowBody = sheet.createRow(i);
		for (int j = 0; j < rowsData.size(); j++) {
			Cell cell = rowBody.createCell(j);
			WebElement webElement = rowsData.get(j);
			String text = webElement.getText();
			cell.setCellValue(text);
			
		 }
	}
			FileOutputStream stream = new FileOutputStream(f);
			w.write(stream);
			System.out.println();
			
			
		}
		
	}


		
		
	


