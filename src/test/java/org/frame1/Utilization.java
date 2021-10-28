package org.frame1;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Utilization extends Base{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Utilization m = new Utilization();
		m.browserLaunch("https://adactinhotelapp.com/");
		WebElement username = m.locators("id", "username");
		String text = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx","sheet1" , 0, 0);
		m.enterText(username, text);
		
		WebElement usertxt = m.locators("id", "password");
		String text1 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx","sheet1", 1, 0);
		m.enterText(usertxt, text1);
		
		WebElement txctlogin = m.locators("id", "login");
		m.buttonClick(txctlogin);
		
		WebElement location = m.locators("id", "location");
		String text2 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 2, 0);
		m.selectByIndex(location, Integer.parseInt(text2));

		
		WebElement hotels = m.locators("id", "hotels");
		String text3 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 3, 0);
		m.selectByIndex(hotels, Integer.parseInt(text3));
		
		WebElement typeroom = m.locators("id", "room_type");
		String text4 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 4, 0);
		m.selectByIndex(typeroom, Integer.parseInt(text4));
		
		WebElement numroom = m.locators("id", "room_nos");
		String text5 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 5, 0);
		m.selectByIndex(numroom, Integer.parseInt(text5));
		
		WebElement indate = m.locators("id", "datepick_in");
		indate.clear();
		Thread.sleep(3000);
		String text6 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 6, 0);
		m.enterText(indate, text6);
		
		WebElement outdate = m.locators("id", "datepick_out");
		outdate.clear();
		Thread.sleep(3000);
		String text7 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 7, 0);
		m.enterText(outdate, text7);
		
		WebElement adult = m.locators("id", "adult_room");
		String text8 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 8, 0);
		m.selectByIndex(adult, Integer.parseInt(text8));
		
		WebElement child = m.locators("id", "child_room");
		String text9 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 9, 0);
		m.selectByIndex(child, Integer.parseInt(text9));
		
		WebElement search = m.locators("id", "Submit");
		m.buttonClick(search);
		
		WebElement radiobtn = m.locators("id", "radiobutton_0");
		m.buttonClick(radiobtn);
		
		WebElement clkContinue = m.locators("id", "continue");
		m.buttonClick(clkContinue);	
		
		WebElement firstname = m.locators("id", "first_name");
		String text10 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 10, 0);
		m.enterText(firstname,text10);
		
		WebElement lastname = m.locators("id", "last_name");
		String text11 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 11, 0);
		m.enterText(lastname, text11);
		
		WebElement address = m.locators("id", "address");
		String text12 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 12, 0);
		m.enterText(address, text12);
		
		WebElement cardnum = m.locators("id", "cc_num");
		String text13 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 13, 0);
		m.enterText(cardnum, text13);
		
		WebElement cardtype = m.locators("id", "cc_type");
		String text14 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 14, 0);
		m.selectByIndex(cardtype, Integer.parseInt(text14));
		
		WebElement month = m.locators("id", "cc_exp_month");
		String text15 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 15, 0);
		m.selectByIndex(month, Integer.parseInt(text15));
		
		WebElement locators = m.locators("id", "cc_exp_year");
		String text16 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 16, 0);
		m.selectByIndex(locators, Integer.parseInt(text16));

		WebElement txtcvv = m.locators("id", "cc_cvv");
		String text17 = m.excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 17, 0);
		m.enterText(txtcvv, text17);
		
		WebElement booknow = m.locators("id", "book_now");
		Thread.sleep(2000);
		m.buttonClick(booknow);	
		
		}
}
