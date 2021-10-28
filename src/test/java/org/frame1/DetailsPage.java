package org.frame1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage extends Base {

	public DetailsPage() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement numroom;
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	@FindBy(id="datepick_out")
	private WebElement checkout;
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	@FindBy(id="child_room")
	private WebElement childRoom;
	@FindBy(id="Submit")
	private WebElement submit;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNumroom() {
		return numroom;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getSubmit() {
		return submit;
	}
	

}
