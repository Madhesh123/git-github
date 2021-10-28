package org.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class madheshMaven {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("Madhesh07");
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("9677878560");
		WebElement btnLogIn = driver.findElement(By.id("login"));
		btnLogIn.click();
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select select = new Select(location);
		select.selectByIndex(5);
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select sel = new Select(hotels);
		sel.selectByIndex(2);
		WebElement rooms = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s = new Select(rooms);
		s.selectByIndex(1);
		WebElement numRooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select slt = new Select(numRooms);	
		slt.selectByIndex(3);
		WebElement adults = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select a = new Select(adults);
		a.selectByIndex(4);
		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select m = new Select(child);
		m.selectByIndex(1);
		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		search.click();
		
	}

}
