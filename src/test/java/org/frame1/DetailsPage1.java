package org.frame1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage1 extends Base{
	public DetailsPage1() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radioBtn;
	
	@FindBy(id="continue")
	private WebElement continues;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinues() {
		return continues;
	}
	

	
}
