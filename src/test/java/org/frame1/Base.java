 package org.frame1;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.BreakClear;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	static WebDriver driver;
	
	public static void browserLaunch(String url ) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	//private WebElement element;
	
	public WebElement locators(String type, String attributeValue) {
		
		if (type.equals("id")) {
			
		WebElement findElement = driver.findElement(By.id(attributeValue));
		
		return findElement;
	}
		
		else if (type.equals("name")) {
			
			WebElement findElement = driver.findElement(By.name(attributeValue));
			
			return findElement;

	} 
		else {
			WebElement findElement = driver.findElement(By.xpath(attributeValue));
			return findElement;
		
		}
		
}
	//send keys
	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
		

	}
	public static void buttonClick(WebElement element) {
		element.click();
	}
	
		
	
	public static void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public static String excelRead(String path, String sheet, int row, int cell) throws IOException {
    File f = new File(path);
    FileInputStream stream = new FileInputStream(f);
    Workbook w = new XSSFWorkbook(stream);
    Sheet sheet2 = w.getSheet(sheet);
    Row row2 = sheet2.getRow(row);
    Cell cell2 = row2.getCell(cell);
    int cellType = cell2.getCellType();
	
	

	if(cellType==1) {
	String stringCellValue = cell2.getStringCellValue();
	return stringCellValue;
	
	}
	else if (DateUtil.isCellDateFormatted(cell2)) {
		Date dateCellValue = cell2.getDateCellValue();
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		String format = d.format(dateCellValue);
		return format;
	} 
	else {
		double numericCellValue = cell2.getNumericCellValue();
	
		long l =(long) numericCellValue;
		String valueOf = String.valueOf(l);
		return valueOf;
		}
	}
		
	
	
	public void clear(WebElement element) {
		element.clear();
	}
	
	public void frameByIndex(int a) {
		driver.switchTo().frame(a);
	}
	
	public void frame(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void windowSwitch(String text) {
		driver.switchTo().window(text);
	}
	
	public void robotClass() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_2);
		
	}
	
	public void simpleAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void confirmAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public void promptAlert(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	
	public void selectByValue(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public void selectByVisible(WebElement element, String text ) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public void deselectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
			
	}
	
	public void deselectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	public void deselectByVisible(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByVisibleText(value);
	}
	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}
	
	public void getFirstSelected(WebElement element) {
		Select select = new Select(element);
		select.getFirstSelectedOption();
	}
	
	private void isMultible(WebElement element) {
		Select select = new Select(element);
		select.isMultiple();
	}
	
//	private void actions(WebElement element) {
//		actions.
//	}
//	
//	
	
	
	
	
	
	
	
}
	
	

	

