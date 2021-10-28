package org.frame1;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinUtilization extends Base {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		browserLaunch("https://adactinhotelapp.com/");
		
		LoginPage a = new LoginPage();
		
		WebElement username = a.getUsername();
		String excelRead = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx","sheet1", 0, 0);
		enterText(username, excelRead);
		
		WebElement password = a.getPassword();
		String text1 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx","sheet1",1,0);
		enterText(password, text1);
		
		WebElement login = a.getLogin();
		login.click();
		
		DetailsPage b = new DetailsPage();
		
		WebElement location = b.getLocation();
		String text2 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 2, 0);
		selectByIndex(location, Integer.parseInt(text2));

		WebElement hotels = b.getHotels();
		String text3 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 3, 0);
		selectByIndex(hotels, Integer.parseInt(text3));
		
		WebElement roomType = b.getRoomType();
		String text4 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 4, 0);
		selectByIndex(roomType, Integer.parseInt(text4));
		
		WebElement numroom = b.getNumroom();
		String text5 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 5, 0);
		selectByIndex(numroom, Integer.parseInt(text5));
		
		WebElement checkIn = b.getCheckIn();
		checkIn.clear();
		Thread.sleep(3000);
		String text6 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 6, 0);
		enterText(checkIn, text6);
		
		WebElement checkout = b.getCheckout();
		checkout.clear();
		Thread.sleep(3000);
		String text7 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 7, 0);
		enterText(checkout, text7);
		
		WebElement adultRoom = b.getAdultRoom();
		String text8 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 8, 0);
		selectByIndex(adultRoom, Integer.parseInt(text8));
		
		WebElement childRoom = b.getChildRoom();
		String text9 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 9, 0);
		selectByIndex(childRoom, Integer.parseInt(text9));
		
		WebElement submit = b.getSubmit();
		submit.click();
		
		DetailsPage1 c = new DetailsPage1();
		
		WebElement radioBtn = c.getRadioBtn();
		radioBtn.click();
		
		WebElement continues = c.getContinues();
		continues.click();
		
		BookingPage d = new BookingPage();
		
		WebElement firstName = d.getFirstName();
		String text10 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 10, 0);
		enterText(firstName,text10);
		
		WebElement lastName = d.getLastName();
		String text11 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 11, 0);
		enterText(lastName, text11);
		
		WebElement address = d.getAddress();
		String text12 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 12, 0);
		enterText(address, text12);
		
		WebElement cardNum = d.getCardNum();
		String text13 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 13, 0);
		enterText(cardNum, text13);
		
		WebElement cardType = d.getCardType();
		String text14 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 14, 0);
		selectByIndex(cardType, Integer.parseInt(text14));
		
		WebElement month = d.getMonth();
		String text15 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 15, 0);
		selectByIndex(month, Integer.parseInt(text15));
		
		WebElement year = d.getYear();
		String text16 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 16, 0);
		selectByIndex(year, Integer.parseInt(text16));

		WebElement cvvNum = d.getCvvNum();
		String text17 = excelRead("C:\\Users\\Mahesh\\Downloads\\New folder\\Book12.xlsx", "sheet1", 17, 0);
		enterText(cvvNum, text17);
		
		WebElement bookNow = d.getBookNow();
		Thread.sleep(2000);
		d.buttonClick(bookNow);	
		
		
	}
	
}
